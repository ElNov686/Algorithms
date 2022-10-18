import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {
    @Test
    public void isPositiveNumber555(){
        int number = 555;
        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.isPositiveNumber(number);
        boolean extectedResult = true;
        Assertions.assertEquals(actualResult, extectedResult);
    }
    @Test
    public void isPositiveNumber0555(){
        int number = -555;
        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.isPositiveNumber(number);
        boolean extectedResult = false;
        Assertions.assertEquals(actualResult, extectedResult);
    }
    @Test
    public void isPositiveNumber0(){
        int number = 0;
        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.isPositiveNumber(number);
        boolean extectedResult = true;
        Assertions.assertEquals(actualResult, extectedResult);
    }

}
