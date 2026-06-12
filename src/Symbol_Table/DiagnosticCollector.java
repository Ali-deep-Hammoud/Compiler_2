package Symbol_Table;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Aggregates syntax ({@link CompilerError}) and semantic ({@link SemanticError}) diagnostics.
 */
public class DiagnosticCollector {
    private final CompilerErrorReporter syntaxReporter;
    private final List<SemanticError> semanticErrors = new ArrayList<>();

    public DiagnosticCollector() {
        this.syntaxReporter = new CompilerErrorReporter();
    }

    public CompilerErrorReporter getSyntaxReporter() {
        return syntaxReporter;
    }

    public List<SemanticError> getSemanticErrors() {
        return semanticErrors;
    }

    public void reportSemantic(SemanticError error) {
        if (error != null) {
            semanticErrors.add(error);
        }
    }

    public void reportSemantic(String file, int line, int column, String message) {
        reportSemantic(new SemanticError(file, line, column, message));
    }

    public boolean hasErrors() {
        return !syntaxReporter.getErrors().isEmpty() || !semanticErrors.isEmpty();
    }

    public int errorCount() {
        return syntaxReporter.getErrors().size() + semanticErrors.size();
    }

    public List<String> formatAll() {
        List<String> all = new ArrayList<>();
        for (CompilerError e : syntaxReporter.getErrors()) {
            all.add(e.toString());
        }
        for (SemanticError e : semanticErrors) {
            all.add(e.toString());
        }
        return Collections.unmodifiableList(all);
    }

    public void printAll() {
        for (String line : formatAll()) {
            System.err.println(line);
        }
    }
}
