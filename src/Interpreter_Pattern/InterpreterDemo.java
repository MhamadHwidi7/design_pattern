package Interpreter_Pattern;

public class InterpreterDemo {
    public static void main(String[] args) {
        Context context = new Context(5, 10);

        Expression expression = new Plus(new Number(5), new Number(7));
        int result = expression.interpret(context);

        System.out.println("Result: " + result);  // Output: Result: 12
    }
}
