package Interpreter_Pattern;

public class Context {
    private final int x;
    private final int y;

    public Context(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getValue(String variable) {
        if (variable.equalsIgnoreCase("x")) return x;
        else if (variable.equalsIgnoreCase("y")) return y;
        return 0;
    }
}
