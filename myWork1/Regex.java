
// Here's a simple Java program that uses regular expressions to check if a string contains the word "Java":

import java.util.regex.*;
import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
	System.out.print("Enter: ");
	Scanner input = new Scanner(System.in);
        String inp = input.nextLine();
        String regex = ".*love.*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inp);

        if (matcher.matches()) {
            System.out.println("The input contains 'love'.");
        } else {
            System.out.println("The input does not contain 'love'.");
        }
    }
}


/*
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
    public static void main(String[] args) {

        String toys = "red car, blue truck, red ball, red car";

        Pattern pattern = Pattern.compile("red car");
        Matcher matcher = pattern.matcher(toys);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}
*/