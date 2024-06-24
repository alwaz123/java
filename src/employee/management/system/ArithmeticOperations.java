public class ArithmeticOperations {
    public static void main(String[] args) {
        // Declare variables
        int num1 = 10;
        int num2 = 5;

        // Addition
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = num1 * num2;
        System.out.println("Product: " + product);

        // Division
        // Note: Division by zero should be handled separately
        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Modulus
        int remainder = num1 % num2;
        System.out.println("Remainder: " + remainder);
    }
}
