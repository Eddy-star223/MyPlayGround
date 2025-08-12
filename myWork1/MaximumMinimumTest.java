import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaximumMinimumTest {

@Test
public void showRange(){
MaximumMinimum array = new MaximumMinimum();
int[] numbers = {5, 6, 10, 15, 20};

int[] expectedValue = {15};
int[] actualValue = array.range(numbers);

 
assertArrayEquals(expectedValue, actualValue);



}

}