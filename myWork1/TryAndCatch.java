/*
How It Works:
try Block – Contains the code that may throw an exception.

catch Block – Catches and handles the exception if one occurs.

Optional finally Block – Used to execute code regardless of whether an exception was thrown or not.
*/
// Example:
// java



public class TryAndCatch {
    public static void main(String[] args) {

        try {
            int result = 10 / 0; // This causes a divide by zero exception
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        
	} finally {
            System.out.println("This always executes.");
        }
    }
}


/*
Explanation:
The try block attempts to divide by zero, which causes an ArithmeticException.

The catch block catches that exception and prints an error message.

The finally block runs no matter what, ensuring cleanup actions like closing resources.

This mechanism prevents your program from crashing and allows it to handle unexpected situations effectively. Need more details?
*/


