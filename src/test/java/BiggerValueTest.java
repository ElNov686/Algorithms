import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BiggerValueTest {

    @Test
    public void biggerValue9999(){
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;
        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void biggerValue(){
        int a = -1000;
        int b = 999999999;
        int expectedResult = 999999999;
        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }



}
