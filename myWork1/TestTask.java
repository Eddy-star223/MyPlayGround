/*
import java.util.Scanner;

public class TestTask {
public static double returnFive(int number) {

	return (number % 5 == 0) ? Math.sqrt(number) : number % 5;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter number: ");
int number = input.nextInt();

System.out.println(TestTask.returnFive(number));
}

}

// Python
def return_five(number):
    return number * number if number % 5 == 0 else number % 5

def main():
    number = int(input("Enter number: "))
    print(return_five(number))



public class TestTask {
public static void main(String[] args) {

String[][] matrix = {{"[0][0]", "[0][1]", "[0][2]"}, 
                     {"[1][0]", "[1][1]", "[1][2]"},
                     {"[2][0]", "[2][1]", "[2][2]"},
                     {"[3][0]", "[3][1]", "[3][2]"}};



	int stepCount = 0;
                
for(int a = 0; a < matrix[0].length; a++) {
    for(int b = 0; b < matrix.length; b++) {

        System.out.print("Step: " + stepCount);
        System.out.print(", Element: " + matrix[b][a]);
        System.out.println();
        stepCount++;
    }
}	




public class TestTask {
public static void main(String[] args) {

double[][] times = {{64.791, 75.972, 68.950, 79.039, 73.006, 74.157}, {67.768, 69.334, 70.450, 67.667, 75.686, 76.298}, {72.653, 77.649, 74.245, 62.121, 63.379, 79.354}};
		
		double runnerTime = 0.0;
		for(int outer = 0; outer < times.length; outer++) {
			runnerTime = 0.0;
			for(int inner = 0; inner < times[outer].length; inner++) {
        		System.out.println("Runner index: " + outer + ", Time index: " + inner);
				// Add a line to sum up the values in each row.
        runnerTime += times[outer][inner];
			}
      double averageVal = 0;
      averageVal = runnerTime / times[outer].length;

			System.out.println("Sum of runner " + outer + " times: " + runnerTime);
			System.out.println("Average of runner " + outer + ": " + averageVal);
		}


public class TestTask {
public static void main(String[] args) {

String[][] matrix = {{"[0][0]", "[0][1]", "[0][2]"}, 
                     {"[1][0]", "[1][1]", "[1][2]"},
                     {"[2][0]", "[2][1]", "[2][2]"},
                     {"[3][0]", "[3][1]", "[3][2]"}};

	int stepCount = 0;
        
for(int a = 0; a < matrix.length; a++) {
    for(int b = 0; b < matrix[a].length; b++) {
        System.out.print("Step: " + stepCount);
        System.out.print(", Element: " + matrix[a][b]);
        System.out.println();
        stepCount++;
    }
}
    }
}	

*/	

// backward 2D array

public class TestTask {
public static void main(String[] args) {

String[][] matrix = {{"[0][0]", "[0][1]", "[0][2]"}, 
                     {"[1][0]", "[1][1]", "[1][2]"},
                     {"[2][0]", "[2][1]", "[2][2]"},
                     {"[3][0]", "[3][1]", "[3][2]"}};

	int stepCount = 0;
        
for(int a = matrix.length - 1; a > 0; a--) {
    for(int b = matrix[a].length - 1; b > 0; b--) {
	
        System.out.print("Step: " + stepCount);
        System.out.print(", Element: " + matrix[a][b]);
        System.out.println();
        stepCount++;
    }
}
    }
}	














