import java.util.Scanner; 

/*
public class ScoreSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int sum = 0; 
     
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score " + i + ": "); 
            int score = input.nextInt(); 
            sum += score; 
        }

        System.out.println("Total sum of scores: " + sum); 
    }
}
*/

import java.util.Scanner; 

public class ScoreSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int sum = 0; 
        double average = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score " + i + ": "); 
            int score = input.nextInt(); 
            sum += score;
	    average = sum / 10; 
        }

        System.out.println("Total average of scores: " + average); 
    }
}


sum = 0  
count = 10

for i in range(count):
    score = int(input(f"Enter score {i + 1}: "))  # Collect score one by one
    sum += score  # Add each score to total

average = sum / count 
print("Total Sum:", sum)
print("Average:", average)


sum = 0  
count = 10
even_index_scores = ""  

for i in range(1, count + 1):  
    score = int(input(f"Enter score {i}: "))  
    sum += score  # Add to total sum

    if i % 2 == 0:  # Check if index is even
        even_index_scores += f"{score} " 

print("Total Sum:", sum)
print("Scores at Even Indexes:", even_index_scores)







import java.util.Scanner;

public class ScoreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Initialize sum
        String evenIndexScores = ""; // Store even-position scores as text

        for (int i = 1; i <= 10; i++) { // Loop from 1 to 10
            System.out.print("Enter score " + i + ": ");
            int score = scanner.nextInt(); // Collect score one by one
            sum += score; // Add to total sum

            if (i % 2 == 0) { // Check if index is even
                evenIndexScores += score + " "; // Store the score
            }
        }

        scanner.close(); // Close scanner
        System.out.println("Total Sum: " + sum);
        System.out.println("Scores at Even Indexes: " + evenIndexScores);
    }
}

















