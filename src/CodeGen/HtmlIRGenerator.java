package CodeGen;

import AST.*;
import IR.IRInstruction;
import IR.IRProgram;
import IR.OpCode;

/**
 * Generates intermediate code for HTML/Jinja template rendering.
 */
public class HtmlIRGenerator {
    private IRProgram ir;

    public IRProgram generate(Program program) {
        this.ir = new IRProgram("html");
        if (program == null) {
            return ir;
        }
        for (BodyNode node : program.getBodyNodes()) {
            emitNode(node);
        }
        return ir;
    }

    private void emitNode(BodyNode node) {
        if (node == null) {
            return;
        }
        if (node instanceof Text) {
            ir.emit(IRInstruction.of(OpCode.HTML_TEXT, ((Text) node).getText(), node.line));
        } else if (node instanceof HTMLElement) {
            emitElement((HTMLElement) node);
        } else if (node instanceof HTMLSingleElement) {
            emitVoid((HTMLSingleElement) node);
        } else if (node instanceof JinjaExpression) {
            emitJinjaExpr((JinjaExpression) node);
        } else if (node instanceof JinjaIf) {
            emitJinjaIf((JinjaIf) node);
        } else if (node instanceof JinjaFor) {
            emitJinjaFor((JinjaFor) node);
        } else if (node instanceof JinjaBlock) {
            for (BodyNode child : ((JinjaBlock) node).getBodys()) {
                emitNode(child);
            }
        } else if (node instanceof CSSBody) {
            ir.emit(IRInstruction.of(OpCode.COMMENT, "inline-css", node.line));
            for (CSSRule rule : ((CSSBody) node).getCssRules()) {
                ir.emit(IRInstruction.of(OpCode.COMMENT, "css-rule@" + rule.line, rule.line));
            }
        }
    }

    private void emitElement(HTMLElement el) {
        ir.emit(IRInstruction.of(OpCode.HTML_TAG_OPEN, el.getTag(), formatAttrs(el), "", el.line));
        for (BodyNode child : el.getChildren()) {
            emitNode(child);
        }
        ir.emit(IRInstruction.of(OpCode.HTML_TAG_CLOSE, el.getTag(), el.line));
    }

    private void emitVoid(HTMLSingleElement el) {
        ir.emit(IRInstruction.of(OpCode.HTML_VOID_TAG, el.getTag(), formatAttrs(el), "", el.line));
    }

    private String formatAttrs(HTMLElement el) {
        StringBuilder sb = new StringBuilder();
        for (Attribute a : el.getAttributes()) {
            if (!sb.isEmpty()) {
                sb.append(", ");
            }
            sb.append(a.getName()).append("=");
            AttributeValue v = a.getValue();
            if (v instanceof AttributeString) {
                sb.append(((AttributeString) v).getValue());
            } else if (v instanceof AttributeJinja) {
                sb.append("{{...}}");
            }
        }
        return sb.toString();
    }

    private String formatAttrs(HTMLSingleElement el) {
        StringBuilder sb = new StringBuilder();
        for (Attribute a : el.getAttributes()) {
            if (!sb.isEmpty()) {
                sb.append(", ");
            }
            sb.append(a.getName()).append("=");
            AttributeValue v = a.getValue();
            if (v instanceof AttributeString) {
                sb.append(((AttributeString) v).getValue());
            } else if (v instanceof AttributeJinja) {
                sb.append("{{...}}");
            }
        }
        return sb.toString();
    }

    private void emitJinjaExpr(JinjaExpression expr) {
        if (expr == null) {
            return;
        }
        StringBuilder content = new StringBuilder();
        for (JinjaExpr je : expr.getText()) {
            if (je instanceof JinjaText) {
                content.append(((JinjaText) je).getText());
            } else if (je instanceof JinjaFunction) {
                JinjaFunction fn = (JinjaFunction) je;
                content.append(fn.getName().getText()).append("(...)");
            }
        }
        ir.emit(IRInstruction.of(OpCode.JINJA_EXPR, content.toString(), expr.line));
    }

    private void emitJinjaIf(JinjaIf jf) {
        String cond = jf.getCondition() == null ? "true" : jf.getCondition().toString();
        ir.emit(IRInstruction.of(OpCode.JINJA_IF_BEGIN, cond, jf.line));
        if (jf.getIfBody() != null) {
            emitNode(jf.getIfBody());
        }
        for (JinjaElif elif : jf.getElifs()) {
            ir.emit(IRInstruction.of(OpCode.COMMENT, "elif " + elif.getCondition(), elif.line));
            if (elif.getBody() != null) {
                emitNode(elif.getBody());
            }
        }
        if (jf.getElseBody() != null) {
            ir.emit(IRInstruction.of(OpCode.COMMENT, "else", jf.line));
            emitNode(jf.getElseBody());
        }
        ir.emit(IRInstruction.of(OpCode.JINJA_IF_END, "", jf.line));
    }

    private void emitJinjaFor(JinjaFor jf) {
        String item = jf.getItemName() == null ? "item" : jf.getItemName().getText();
        String coll = jf.getCollectionName() == null ? "items" : jf.getCollectionName().getText();
        ir.emit(IRInstruction.of(OpCode.JINJA_FOR_BEGIN, item, coll, "", jf.line));
        if (jf.getBody() != null) {
            emitNode(jf.getBody());
        }
        ir.emit(IRInstruction.of(OpCode.JINJA_FOR_END, "", jf.line));
    }
}
