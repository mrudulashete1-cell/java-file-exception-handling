// Custom Exception Class
class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}

public class ExceptionDemo {

    // Method for division
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Method to demonstrate exception handling
    public static void checkNumber(int num) {

        // throw custom exception if condition is met
        if (num < 0) {
            throw new MyException("Number should not be negative");
        }

        System.out.println("Number is valid: " + num);
    }

    public static void main(String[] args) {

        try {
            // This will cause ArithmeticException
            int result = divide(10, 0);
            System.out.println("Result: " + result);

            // This will cause custom exception
            checkNumber(-5);

        } 
        // Handling multiple exceptions in one catch
        catch (ArithmeticException | MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally block executed.");
        }
    }
}



