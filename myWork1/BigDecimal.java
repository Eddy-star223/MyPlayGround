/*
import java.math.BigDecimal;

public class BigDecimal {

public static String setBalance(String[] account, String balance) {
String successOfFail = "";

	try {
		BigDecimal convertBalance = new BigDecimal(balance);
		int compare = convertBalance.compareTo(new BigDecimal(0));

		if (compare > 0) {
			account[0] = convertBalance.toString(); 
			successOfFail = "Successful"; 
		}  

		else {
			throw new IllegalArgumentException("Invalid account balance");
			}
	} 

		catch (IllegalArgumentException e) {
			successOfFail = e.getMessage();
	}
	
	return successOfFail;
}

public static String getAccountBalance(String[] account) {
return account[0];

}


public static void main(String[] args) {
String[] account_info = new String[1];
String balance = "15000";

System.out.println(setBalance(account_info, balance));
System.out.println(getAccountBalance(account_info));
//System.out.println(getBalance());
*/

import java.util.ArrayList;
import java.util.Collections;

public class BigDecimal {
public static void main(String[] args) {

ArrayList<Integer> counting = new ArrayList<Integer>();
counting.add(1);
counting.add(7);
counting.add(2);
counting.add(6);
counting.add(5);
counting.add(4);
counting.add(3);

// Collections.sort(counting);
Collections.sort(counting, Collections.reverseOrder());

for (int numbers : counting) {
System.out.println(numbers);

}

}
}







import java.util.*;

public class QuizGame {

    static class Question {
        int id;
        String question;
        String[] options;
        char correctOption;

        Question(int id, String question, String[] options, char correctOption) {
            this.id = id;
            this.question = question;
            this.options = options;
            this.correctOption = correctOption;
        }
    }

    static List<Question> allQuestions = new ArrayList<>();
    static Set<Integer> usedQuestionIds = new HashSet<>();
    static Map<Integer, Set<Character>> removedOptions = new HashMap<>();
    static int lastQuestionId = -1;
    static boolean question1Used = false;
    static int score = 0;
    static int attempted = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadQuestions();
        System.out.println(" Welcome to the Java Quiz Game!");

        while (true) {
            List<Question> available = getAvailableQuestions();
            if (available.isEmpty()) {
                System.out.println(" No more available questions.");
                break;
            }

            Question currentQuestion = available.get(new Random().nextInt(available.size()));
            askQuestion(currentQuestion);

            System.out.println("\nWhat would you like to do next?");
            System.out.println("1. Continue");
            System.out.println("2. Restart");
            System.out.println("3. Exit");
            String choice = scanner.nextLine();

            if (choice.equals("2")) {
                resetGame();
                System.out.println(" Game restarted.");
            } else if (choice.equals("3")) {
                break;
            }
        }

        System.out.println(" Final score: " + score + "/" + attempted);
    }

    static void loadQuestions() {
        allQuestions.add(new Question(1, "What is the capital of France?",
            new String[]{"A. Berlin", "B. London", "C. Paris", "D. Rome"}, 'C'));
        allQuestions.add(new Question(2, "Which planet is known as the Red Planet?",
            new String[]{"A. Earth", "B. Mars", "C. Jupiter", "D. Venus"}, 'B'));
        allQuestions.add(new Question(3, "What is 2 + 2?",
            new String[]{"A. 3", "B. 4", "C. 5", "D. 6"}, 'B'));
        allQuestions.add(new Question(4, "What color is the sky on a clear day?",
            new String[]{"A. Red", "B. Blue", "C. Green", "D. Yellow"}, 'B'));
        allQuestions.add(new Question(5, "What is the largest ocean?",
            new String[]{"A. Atlantic", "B. Indian", "C. Pacific", "D. Arctic"}, 'C'));
    }

    static List<Question> getAvailableQuestions() {
        List<Question> available = new ArrayList<>();
        for (Question q : allQuestions) {
            if (q.id == lastQuestionId) continue;
            if (q.id == 1 && question1Used) continue;
            if (usedQuestionIds.contains(q.id)) continue;
            available.add(q);
        }
        return available;
    }

    static void askQuestion(Question question) {
        int attempts = 0;
        Set<Character> removed = removedOptions.getOrDefault(question.id, new HashSet<>());

        while (attempts < 2) {
            System.out.println("\n" + question.question);
            for (String option : question.options) {
                if (!removed.contains(option.charAt(0))) {
                    System.out.println(option);
                }
            }

            System.out.print("Enter your answer (A-D): ");
            String input = scanner.nextLine().toUpperCase();

            if (input.length() != 1 || input.charAt(0) < 'A' || input.charAt(0) > 'D') {
                System.out.println(" Invalid input. Try A, B, C, or D.");
                continue;
            }

            char answer = input.charAt(0);
            if (removed.contains(answer)) {
                System.out.println(" That option was already tried.");
                continue;
            }

            if (answer == question.correctOption) {
                System.out.println(" Correct!");
                score++;
                attempted++;
                usedQuestionIds.add(question.id);
                if (question.id == 1) question1Used = true;
                lastQuestionId = question.id;
                return;
            } else {
                System.out.println(" Incorrect.");
                removed.add(answer);
                attempts++;
            }
        }

        System.out.println(" You failed this question.");
        attempted++;
        usedQuestionIds.add(question.id);
        if (question.id == 1) question1Used = true;
        removedOptions.put(question.id, removed);
        lastQuestionId = question.id;
    }

    static void resetGame() {
        usedQuestionIds.clear();
        removedOptions.clear();
        lastQuestionId = -1;
        question1Used = false;
        score = 0;
        attempted = 0;
    }
}






