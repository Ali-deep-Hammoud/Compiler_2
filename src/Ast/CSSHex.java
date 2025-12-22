package AST;

public class CSSHex extends CSSTerm{
    private final String num;
    public CSSHex(int line, String num) {
        super(line, "CSS HEX");
        this.num = num;
    }

    public String getNum() {
        return num;
    }
}
