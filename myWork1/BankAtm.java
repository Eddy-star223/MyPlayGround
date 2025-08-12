import java.util.Scanner;

public class BankAtm {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

String[] fruits = {"apple", "banana", "mango", "orange", "pawpaw"};

System.out.println("I want print Fruit");
String fruitName = input.nextLine();

boolean check = false; 

for (String fruit : fruits) {
if (fruit.equalsIgnoreCase(fruitName)) {
check = true;
break;
} 
}
if (check){
System.out.println(fruitName);
}
else {
	System.out.println("Nothing");

}
}
}


