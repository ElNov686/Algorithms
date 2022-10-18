import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    @Test
    public void  areNumbersEqual89(){
        int a = 89;
        int b = 89;
        AreNumbersEqual ne = new AreNumbersEqual();
        int expectedResult = 0;
        int actualResult = ne.areNumbersEqual(a,b);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void  areNumbersEqual8989(){
        int a = 89;
        int b = -89;
        AreNumbersEqual ne = new AreNumbersEqual();
        int expectedResult = 1;
        int actualResult = ne.areNumbersEqual(a,b);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void  areNumbersEqual899(){
        int a = -89;
        int b = 89;
        AreNumbersEqual ne = new AreNumbersEqual();
        int expectedResult = -1;
        int actualResult = ne.areNumbersEqual(a,b);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
