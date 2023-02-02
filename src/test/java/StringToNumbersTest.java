import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StringToNumbersTest {

    @Test
    public void testStingToNumberHappyPath() {
        String string = "[1,2,3,4,5]";
        int[] expectedResults = {1,2,3,4,5};

        StringToNumbers stringToNumbers = new StringToNumbers();
        int[] actualResult = stringToNumbers.stringToNumbers(string);

        Assertions.assertArrayEquals(expectedResults, actualResult);
        System.out.println(Arrays.toString(actualResult));
    }
}
