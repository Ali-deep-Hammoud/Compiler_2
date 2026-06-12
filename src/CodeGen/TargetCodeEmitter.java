package CodeGen;

import IR.IRInstruction;
import IR.IRProgram;
import IR.OpCode;

/**
 * Emits human-readable target code from intermediate representation.
 */
public class TargetCodeEmitter {

    public String emitPython(IRProgram ir) {
        StringBuilder sb = new StringBuilder();
        sb.append("# Generated Python (pseudo-code)\n");
        for (IRInstruction inst : ir.getInstructions()) {
            switch (inst.getOp()) {
                case FUNC_BEGIN -> sb.append("\ndef ").append(inst.getArg1()).append("():\n");
                case FUNC_END -> sb.append("    # end ").append(inst.getArg1()).append("\n");
                case LABEL -> sb.append(inst.getArg1()).append(":\n");
                case LOAD_CONST -> sb.append("    ").append(inst.getResult())
                        .append(" = ").append(inst.getArg1()).append("\n");
                case LOAD_VAR -> sb.append("    ").append(inst.getResult())
                        .append(" = ").append(inst.getArg1()).append("\n");
                case STORE_VAR -> sb.append("    ").append(inst.getArg1())
                        .append(" = ").append(inst.getArg2()).append("\n");
                case CALL -> sb.append("    ").append(inst.getResult())
                        .append(" = ").append(inst.getArg1()).append("(").append(inst.getArg2()).append(")\n");
                case RETURN -> sb.append("    return ").append(inst.getArg1()).append("\n");
                case GOTO -> sb.append("    goto ").append(inst.getArg1()).append("\n");
                case IF_FALSE_GOTO -> sb.append("    if not ").append(inst.getArg1())
                        .append(": goto ").append(inst.getArg2()).append("\n");
                case BINOP -> sb.append("    ").append(inst.getResult())
                        .append(" = ").append(formatBinop(inst)).append("\n");
                case COMMENT -> sb.append("    # ").append(inst.getArg1()).append("\n");
                default -> sb.append("    ; ").append(inst).append("\n");
            }
        }
        return sb.toString();
    }

    public String emitHtml(IRProgram ir) {
        StringBuilder sb = new StringBuilder();
        for (IRInstruction inst : ir.getInstructions()) {
            switch (inst.getOp()) {
                case HTML_TEXT -> sb.append(inst.getArg1());
                case HTML_TAG_OPEN -> sb.append("<").append(inst.getArg1()).append(">");
                case HTML_TAG_CLOSE -> sb.append("</").append(inst.getArg1()).append(">");
                case HTML_VOID_TAG -> sb.append("<").append(inst.getArg1()).append(" />");
                case JINJA_EXPR -> sb.append("{{").append(inst.getArg1()).append("}}");
                case JINJA_FOR_BEGIN -> sb.append("{% for ").append(inst.getArg1())
                        .append(" in ").append(inst.getArg2()).append(" %}");
                case JINJA_FOR_END -> sb.append("{% endfor %}");
                case JINJA_IF_BEGIN -> sb.append("{% if ").append(inst.getArg1()).append(" %}");
                case JINJA_IF_END -> sb.append("{% endif %}");
                case COMMENT -> { /* skip css comments in output */ }
                default -> { }
            }
        }
        return sb.toString();
    }

    private String formatBinop(IRInstruction inst) {
        String[] parts = inst.getArg2().split(":", 2);
        String op = parts.length > 0 ? parts[0] : "";
        String right = parts.length > 1 ? parts[1] : "";
        if (".".equals(op)) {
            return inst.getArg1() + "." + right;
        }
        return inst.getArg1() + " " + op + " " + right;
    }
}
