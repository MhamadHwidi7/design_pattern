package Interpreter_Pattern;
// Terminal Expression
public class Number implements  Expression{
    private final int value;

    public Number(int value) {
        this.value = value;
    }


    @Override
    public int interpret(Context context) {
        return value;
    }
}
