import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GoodBadNumberTest {
    @Test
    public void goodBadNumber15(){
        Integer m = 15;
        GoodBadNumber gb = new GoodBadNumber();
        String actualResult = gb.goodBadNumber(m);
        String expectedResult = "Good number";
        Assertions.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void goodBadNumber6(){
        Integer m = 6;
        GoodBadNumber gb = new GoodBadNumber();
        String actualResult = gb.goodBadNumber(m);
        String expectedResult = "Bad number";
        Assertions.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void goodBadNumber100(){
        Integer m = 100;
        GoodBadNumber gb = new GoodBadNumber();
        String actualResult = gb.goodBadNumber(m);
        String expectedResult = "Poor number";
        Assertions.assertEquals(actualResult, expectedResult);
    }
}
