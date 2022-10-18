import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {

    @Test
    public void testSumArray15(){
        int sa[] = {0, 1, 2, 3, 4, 5};
        SumArray saa = new SumArray();
        int actualResult = saa.sumArray(sa);
        int expectedResult = 15;
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testSumArray10(){
        int sa[] = {-7, -3};
        SumArray saa = new SumArray();
        int actualResult = saa.sumArray(sa);
        int expectedResult = -10;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
