public class SimpleCalculator {
    public static void main(String[] args) {
        double a = 12.5, b = 4.5;
        char operator = '+';
        double result = 0;

        switch (operator) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = b != 0 ? a / b : Double.NaN; break;
            default: System.out.println("Unknown operation."); return;
        }
        System.out.println("Result: " + result);
    }
}