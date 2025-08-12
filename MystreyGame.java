import java.util.Random;
import java.util.Scanner;

public class MystreyGame {
public static void main(String[] args) {
int count = 0;
Random random = new Random();
Scanner input = new Scanner(System.in);

int randomNumber = random.nextInt(3);
int counter;
int guess;

for (counter = 0; counter < 2;) {
System.out.print("Enter first trail: ");
guess = input.nextInt();

if (guess == randomNumber) {
System.out.println("You guess the correct number.");
count++;
break;
} else if (guess < randomNumber) {
System.out.println("You guess is too low.");
} else if (guess > randomNumber) {
System.out.println("Your guess is too high.");

count++;
if (count % 3 == 0)
System.out.println("Game Over");    
 
}
}
   

  }
}

  
 

