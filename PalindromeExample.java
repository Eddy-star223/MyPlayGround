import java.util.Scanner;

public class PalindromeExample {
public static void main(String[] args) {
Scanner input = new Scanner (System.in);

while (true) {
System.out.print("Enter three-digits integer: ");
String user = Input.next();
if (user.length() != 3 || user.matches("\\d+"));
System.out.print("Error.. Enter three-digits integer");
continue;
}

if (isPalindrome(user)) {
System.out.print(user  + "is a palindrome");
}
else {
System.out.print(user + "is not a  palindrome");


}



}
}