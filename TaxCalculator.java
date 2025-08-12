import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

  double LOWER_TAX_RATE = 0.15;
  double HIGHER_TAX_RATE = 0.20;
  double TAX_CEILING = 30000.0;

  for (int i = 1; i <= 3; i++) {
            
    System.out.print("Enter citizen name " + i + ": ");
    String name = input.nextLine();

            System.out.print("Enter the earnings of " + name + ": ");
            double earnings = input.nextDouble();
            input.nextLine(); // Consume the newline character

            // Calculate the total tax
            double tax;
            if (earnings <= TAX_CEILING) {
                tax = earnings * LOWER_TAX_RATE;
            } else {
                tax = (TAX_CEILING * LOWER_TAX_RATE) + ((earnings - TAX_CEILING) * HIGHER_TAX_RATE);
            }

            // Display the total tax
            System.out.printf("The total tax for %s is: $%.2f%n", name, tax);
        }
    }
}