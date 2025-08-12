import java.util.Scanner;

public class Example10 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the first integers: ");
int a = input.nextInt();
System.out.print("Enter the second integers: ");
int b = input.nextInt();
System.out.print("Enter the third integers: ");

int c = input.nextInt();

int sum = a + b + c;

System.out.printf("The number is %d", sum);
}
}

