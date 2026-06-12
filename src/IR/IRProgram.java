package IR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IRProgram {
    private final String name;
    private final List<IRInstruction> instructions = new ArrayList<>();
    private int tempCounter;

    public IRProgram(String name) {
        this.name = name == null ? "module" : name;
    }

    public String getName() {
        return name;
    }

    public void emit(IRInstruction instruction) {
        if (instruction != null) {
            instructions.add(instruction);
        }
    }

    public String freshTemp() {
        return "t" + (tempCounter++);
    }

    public List<IRInstruction> getInstructions() {
        return Collections.unmodifiableList(instructions);
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("; IR for ").append(name).append("\n");
        for (IRInstruction inst : instructions) {
            sb.append("  ").append(inst).append("\n");
        }
        return sb.toString();
    }
}
