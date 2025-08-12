import java.util.Scanner;

public class NumberCollector {
public static void main(String[] args) {
int largestNumber = -2435353;
Scanner input = new Scanner(System.in);



/*
while (counter != 5) {
System.out.println("Enter number " + (counter + 1) + ":");
int userInput = input.nextInt();
if (userInput > largestNumber) largestNumber = userInput;
counter++;
 }
System.out.println("The largest number is: " + largestNumber); */

int apple;
apple = 8;

for (int counter = 1; counter <= 5; counter+= 1) {
apple += 1 ;
System.out.println("Enter number"+ counter + apple);
int userInput = input.nextInt();
if (userInput > largestNumber) largestNumber = userInput;

 }
System.out.println("The largest number is: " + largestNumber);

}
}