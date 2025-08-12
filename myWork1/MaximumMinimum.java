import java.util.Arrays;

public class MaximumMinimum {

public static int[] maximumAndMinimum(int[] numbers) {

	int maximum = numbers[0];
	int minimum = numbers[0];

for (int counter = 0; counter < numbers.length; counter++) {
	if (numbers[counter] < minimum) {
	minimum = numbers[counter];
}

	else if(numbers[counter] > maximum) {
	maximum = numbers[counter];
   }

}
	
	return new int[] {minimum, maximum};

   }


	public int[] range(int[] numbers){

	int[] largestAndSmallest = maximumAndMinimum(numbers);
	int smallest = largestAndSmallest[0];
	int largest = largestAndSmallest[1];

	return new int[] {largest - smallest};	

}
}