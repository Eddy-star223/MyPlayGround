import java.util.*;

public class StudentGradingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Step 2: Ask for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize arrays to store student data
        String[] studentNames = new String[numStudents];
        int[][] scores = new int[numStudents][numSubjects];
        int[] totals = new int[numStudents];
        double[] averages = new double[numStudents];
        int[] positions = new int[numStudents];

        // Step 3: Collect scores for each student and subject
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            studentNames[i] = scanner.next();

            int totalScore = 0;
            for (int j = 0; j < numSubjects; j++) {
                int score;
                do {
                    System.out.print("Enter score for " + studentNames[i] + " in subject " + (j + 1) + " (0-100): ");
                    score = scanner.nextInt();
                } while (score < 0 || score > 100);
                scores[i][j] = score;
                totalScore += score;
            }
            totals[i] = totalScore;
            averages[i] = totalScore / (double) numSubjects;
        }

        // Step 4: Calculate positions based on averages
        double[] sortedAverages = averages.clone();
        Arrays.sort(sortedAverages);
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < numStudents; j++) {
                if (averages[i] == sortedAverages[j]) {
                    positions[i] = j + 1;
                    break;
                }
            }
        }

        // Step 5: Display class summary
        System.out.println("\nStudent Summary:");
        System.out.println("Student\t\t" + String.join("\t", Arrays.stream(new String[numSubjects]).map(s -> "Subject").toArray(String[]::new)) + "\tTotal\tAverage\tPosition");
        for (int i = 0; i < numStudents; i++) {
            System.out.print(studentNames[i] + "\t\t");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.println(totals[i] + "\t" + String.format("%.2f", averages[i]) + "\t" + positions[i]);
        }

        // Step 6: Display subject summary
        System.out.println("\nSubject Summary:");
        for (int j = 0; j < numSubjects; j++) {
            int highestScore = Integer.MIN_VALUE;
            int lowestScore = Integer.MAX_VALUE;
            int totalScore = 0;
            int passCount = 0;
            int failCount = 0;
            for (int i = 0; i < numStudents; i++) {
                int score = scores[i][j];
                totalScore += score;
                if (score > highestScore) highestScore = score;
                if (score < lowestScore) lowestScore = score;
                if (score >= 50) passCount++;
                else failCount++;
            }
            double averageScore = totalScore / (double) numStudents;
            System.out.println("Subject " + (j + 1) + ":");
            System.out.println("Highest score: " + highestScore);
            System.out.println("Lowest score: " + lowestScore);
            System.out.println("Total score: " + totalScore);
            System.out.println("Average score: " + String.format("%.2f", averageScore));
            System.out.println("Number of passes: " + passCount);
            System.out.println("Number of fails: " + failCount);
        }
    }
}