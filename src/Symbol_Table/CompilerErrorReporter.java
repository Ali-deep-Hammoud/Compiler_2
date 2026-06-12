package Symbol_Table;

import java.util.ArrayList;
import java.util.List;

public class CompilerErrorReporter {
    private final List<CompilerError> errors = new ArrayList<>();

    public void report(CompilerError error) {
        if (error != null) errors.add(error);
    }

    public List<CompilerError> getErrors() { return errors; }

    public void printAll() {
        for (CompilerError e : errors) {
            System.err.println(e.toString());
        }
    }
}
