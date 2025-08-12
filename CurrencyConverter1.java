Prompt the user for the exchange rate: Use a Scanner to read the exchange rate from U.S. dollars to Chinese RMB.
Prompt the user for the conversion direction: Ask whether they want to convert from U.S. dollars to RMB or vice versa.
Prompt the user for the amount: Depending on the conversion direction, ask for the amount in U.S. dollars or RMB.
Perform the conversion: Use the exchange rate to convert the amount.
Display the result: Print the converted amount.
Here’s the implementation:

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for the exchange rate
        System.out.print("Enter the exchange rate from U.S. dollars to Chinese RMB: ");
        double exchangeRate = input.nextDouble();

        // Prompt user for conversion direction
        System.out.print("Enter 0 to convert from U.S. dollars to Chinese RMB, or 1 to convert from Chinese RMB to U.S. dollars: ");
        int direction = input.nextInt();

        double amount, convertedAmount;

        if (direction == 0) {
            // Convert from U.S. dollars to Chinese RMB
            System.out.print("Enter the amount in U.S. dollars: ");
            amount = input.nextDouble();
            convertedAmount = amount * exchangeRate;
            System.out.printf("The amount in Chinese RMB is %.2f%n", convertedAmount);
        } else if (direction == 1) {
            // Convert from Chinese RMB to U.S. dollars
            System.out.print("Enter the amount in Chinese RMB: ");
            amount = input.nextDouble();
            convertedAmount = amount / exchangeRate;
            System.out.printf("The amount in U.S. dollars is %.2f%n", convertedAmount);
        } else {
            System.out.println("Invalid input. Please enter 0 or 1.");
        }
    }
}
