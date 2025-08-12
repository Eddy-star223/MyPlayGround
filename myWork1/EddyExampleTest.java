
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class EddyExamlpeTest {

@Test
public void sortingNumbers() {
int[] eddy = {2, 1, 6, 7, 5, 3};
int expected = {4, 2, 12, 14, 10, 6};
int actual = EddyExample.multiplyPractice(eddy);
assertArrayEquals(expected, actual);
  }

}
