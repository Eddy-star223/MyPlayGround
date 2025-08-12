

public class Work1 {
public static void main(String[] args){

/*
int number = 1;

for (int counter = 0; counter <= 9; counter++) {
System.out.println(number + counter);
} */

int i = 1;

for (int counter = 1; counter <= 2; counter++) {
System.out.printf("%d	%d	%d%n%d	%d	%d%n", i, ++i, ++i, i + 3, i + 2, ++i);
i = 7;
}


}
}