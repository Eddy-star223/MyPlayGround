
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	String holder = " ";

	System.out.print("Please Enter a number: ");
	int num = input.nextInt();

	while (num > 0) {

	int remainder = num % 2;
	holder = remainder + holder;
	 num = num / 2;
}

	System.out.print(holder);
}
}