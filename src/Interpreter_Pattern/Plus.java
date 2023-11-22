package Interpreter_Pattern;

// Nonterminal Expression
public class Plus implements  Expression{
    private final Expression left;
    private final Expression right;

    public Plus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}
