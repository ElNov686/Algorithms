import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StringToLettersTest {

    @Test
    public void testStingToLettersHappyPath() {
        String string = "hgyfdsr";
        char[] expectedResults = {'h', 'g', 'y', 'f', 'd', 's', 'r'};

        StringToLetters stringToLetters = new StringToLetters();
        char[] actualResult = stringToLetters.StringToLetters(string);

        Assertions.assertArrayEquals(expectedResults, actualResult);
        System.out.println(Arrays.toString(actualResult));
    }
}
