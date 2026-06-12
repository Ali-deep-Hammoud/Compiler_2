package Visitor;

import Symbol_Table.CompilerError;
import Symbol_Table.CompilerErrorReporter;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class CustomErrorListener extends BaseErrorListener {
    private final CompilerErrorReporter reporter;
    private final String sourceName;

    public CustomErrorListener(CompilerErrorReporter reporter, String sourceName) {
        this.reporter = reporter;
        this.sourceName = sourceName;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        reporter.report(new CompilerError(sourceName, line, charPositionInLine + 1, CompilerError.Severity.ERROR, msg));
    }
}
