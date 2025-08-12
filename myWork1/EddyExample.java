//import java.util.Arrays;

public class EddyExample {

public static int[] multiplyPractice(int[] eddy) {
//public static void main(String[] args) { 

//int[] eddy = {2, 1, 6, 7, 5, 3};

for (int counter = 0; counter < eddy.length; counter++) {
eddy[counter] *= 2;

}
return eddy;

//System.out.println(Arrays.toString(eddy));

}
}

/*
int total = 2;

int count = 0;

for (int number : eddy) {
if (count == 0) total *= number;
count++;
}
System.out.println(total);
}
}


import java.util.*;

public class UniqueArray {
    public static int[] eliminateDuplicates(int[] arr) {

        List<Integer> uniqueList = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (!seen.contains(num)) {
                uniqueList.add(num);
                seen.add(num);
            }
        }
        // Convert List<Integer> to int[]
        int[] result = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            result[i] = uniqueList.get(i);
        }
        return result;
    }
}
  


public class ArrayUtils {
    public static int[] locateLargest(double[][] array) {

        int[] location = {0, 0};
        double max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] > max) {
                    max = array[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
}


The method returns an array: {rowIndex, columnIndex} of the largest element.
It works for any size of 2D array.



import java.util.Scanner;

public class SmartCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("Choose operation (+, -, *, /): ");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Answer: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Answer: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Answer: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Answer: " + (num1 / num2));
                } else {
                    System.out.println("No fit divide by zero o!");
                }
                break;
            default:
                System.out.println("Wetin be that? I no sabi this operator.");
        }
    }
}







import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 0;
        int choice;

        while (true) {
            System.out.println("\n=== ATM MENU ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance na ₦" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ₦");
                    double deposit = input.nextDouble();
                    balance += deposit;
                    System.out.println("You don deposit ₦" + deposit);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ₦");
                    double withdraw = input.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("You don withdraw ₦" + withdraw);
                    } else {
                        System.out.println("Insufficient funds o!");
                    }
                    break;
                case 4:
                    System.out.println("Thanks for using our ATM. Bye!");
                    return; // Exit the program
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}






import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to Java Quiz!");
        System.out.println("Answer with A, B, or C\n");

        // Question 1
        System.out.println("1. What is the size of int in Java?");
        System.out.println("A. 2 bytes\nB. 4 bytes\nC. 8 bytes");
        System.out.print("Your answer: ");
        char ans1 = input.next().toUpperCase().charAt(0);
        if (ans1 == 'B') score++;

        // Question 2
        System.out.println("\n2. Which keyword is used to create a class?");
        System.out.println("A. method\nB. void\nC. class");
        System.out.print("Your answer: ");
        char ans2 = input.next().toUpperCase().charAt(0);
        if (ans2 == 'C') score++;

        // Question 3
        System.out.println("\n3. What does OOP stand for?");
        System.out.println("A. Object Oriented Programming\nB. Original Object Program\nC. Object Overload Principle");
        System.out.print("Your answer: ");
        char ans3 = input.next().toUpperCase().charAt(0);
        if (ans3 == 'A') score++;

        // Result
        System.out.println("\nYou score: " + score + "/3");
        if (score == 3) {
            System.out.println("You be full Java don!");
        } else if (score == 2) {
            System.out.println("No bad! You dey reason am well.");
        } else {
            System.out.println("Keep going, you dey try!");
        }
    }
}




import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get student name
        System.out.print("Wetin be student name? ");
        String name = input.nextLine();

        // Get scores
        System.out.print("Enter Maths score: ");
        int maths = input.nextInt();

        System.out.print("Enter English score: ");
        int english = input.nextInt();

        System.out.print("Enter Science score: ");
        int science = input.nextInt();

        // Calculate total and average
        int total = maths + english + science;
        double average = total / 3.0;
        char grade;

        // Decide grade using if-else
        if (average >= 70) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Output everything
        System.out.println("\n=== Student Result ===");
        System.out.println("Name: " + name);
        System.out.println("Total Score: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}







import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> phones = new ArrayList<>();
        int choice;

        while (true) {
            System.out.println("\n=== Contact Manager Menu ===");
            System.out.println("1. Add New Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            choice = input.nextInt();
            input.nextLine(); // clear enter key

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = input.nextLine();
                    names.add(name);
                    phones.add(phone);
                    System.out.println("Contact saved!");
                    break;
                case 2:
                    System.out.println("\nSaved Contacts:");
                    for (int i = 0; i < names.size(); i++) {
                        System.out.println((i + 1) + ". " + names.get(i) + " - " + phones.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String search = input.nextLine();
                    boolean found = false;
                    for (int i = 0; i < names.size(); i++) {
                        if (names.get(i).equalsIgnoreCase(search)) {
                            System.out.println("Found: " + names.get(i) + " - " + phones.get(i));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No contact like that found.");
                    }
                    break;
                case 4:
                    System.out.println("App don close. Thank you!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}


*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FruitListApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== Fruit List Menu =====");
            System.out.println("1. Add Fruit");
            System.out.println("2. Remove Fruit");
            System.out.println("3. Show All Fruits");
            System.out.println("4. Search for Fruit");
            System.out.println("5. Sort Fruits");
            System.out.println("6. Clear Fruit List");
            System.out.println("7. Exit");
            System.out.print("Choose your option (1-7): ");

            choice = input.nextInt();
            input.nextLine();  // Consume the enter key

            switch (choice) {
                case 1:
                    System.out.print("Enter fruit to add: ");
                    String addFruit = input.nextLine();
                    fruits.add(addFruit);
                    System.out.println(addFruit + " added successfully!");
                    break;

                case 2:
                    System.out.print("Enter fruit to remove: ");
                    String removeFruit = input.nextLine();
                    if (fruits.remove(removeFruit)) {
                        System.out.println(removeFruit + " removed successfully!");
                    } else {
                        System.out.println(removeFruit + " no dey inside list.");
                    }
                    break;

                case 3:
                    if (fruits.isEmpty()) {
                        System.out.println("Fruit list empty like basket!");
                    } else {
                        System.out.println("Current fruits:");
                        for (int i = 0; i < fruits.size(); i++) {
                            System.out.println((i + 1) + ". " + fruits.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter fruit to search: ");
                    String searchFruit = input.nextLine();
                    if (fruits.contains(searchFruit)) {
                        System.out.println(searchFruit + " dey inside the list!");
                    } else {
                        System.out.println(searchFruit + " no dey found!");
                    }
                    break;

                case 5:
                    Collections.sort(fruits);
                    System.out.println("Fruits don sort finish (A-Z)!");
                    break;

                case 6:
                    fruits.clear();
                    System.out.println("All fruits don clear from list.");
                    break;

                case 7:
                    System.out.println("Thanks for using Fruit List App. Bye bye!");
                    break;

                default:
                    System.out.println("No such option! Try number between 1 to 7.");
            }
        } while (choice != 7);

        input.close();
    }
}












days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]

today = int(input("Enter today's day (Sunday is 0, Monday is 1, ..., Saturday is 6): "))
while today < 0 or today > 6:
    today = int(input("Invalid input. Enter a number between 0 and 6: "))

future = int(input("Enter the number of days after today: "))

future_day = (today + future) % 7

print(f"Today is {days[today]} and the future day is {days[future_day]}.")

Copy code

The program checks for valid input for today’s day.
It calculates the future day using modulo arithmetic.
It displays both today’s and the future day’s names.