import java.util.Scanner;

public class ClassWork1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter number of student: ");
int number = input.nextInt();


int highest = -44444;
String name = " ";
int secondHighest = -44444;
String name2 = " ";

for (int counter = 0; counter <= number; counter++) {
System.out.println("Enter student name: ");
name = input.next();

System.out.println("Enter student score: ");
int score = input.nextInt();

if (score > highest) {  
secondHighest = highest;
name2 = name;

highest = score;
name = name;

} else if (score > secondHighest) {
score = secondHighest;
name = name2;

}
}

System.out.println("The student highest number: " + highest);
System.out.println("The student second highest score: " + secondHighest);

}
}





