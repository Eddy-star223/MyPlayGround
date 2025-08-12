import java.util.Scanner;

public class NameCount {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter name: ");
String name = input.nextLine();
int nameCount = 1;

while (nameCount <= 10){
System.out.println();
System.out.printf("%s", name);
nameCount = nameCount + 1;
}
   
}
}