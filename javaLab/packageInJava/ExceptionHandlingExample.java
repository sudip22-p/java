public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static int divide(int numerator, int denominator) throws ArithmeticException{
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return numerator / denominator;
    }
}
