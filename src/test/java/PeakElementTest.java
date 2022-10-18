import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class PeakElementTest {
    @Test
    @Order(1)
    public  void peakElementHappyPath(){
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int [] expectingResult = {3, 7, 23};
        PeakElement pe = new PeakElement();
        int [] actualResult = pe.peakElement(array);
        Assertions.assertArrayEquals(expectingResult, actualResult);
    }
    @Test
    @Order(2)
    public  void peakElementHappyPathNeganiveNumber(){
        int[] array = {3, 2, -7, 5, 1, -9, 23, 1};
        int [] expectingResult = {3, 5, 23};
        PeakElement pe = new PeakElement();
        int [] actualResult = pe.peakElement(array);
        Assertions.assertArrayEquals(expectingResult, actualResult);
    }
    @Test
    @Order(3)
    public  void peakElementHappyPathZero(){
        int[] array = {0, 2, 0, 0, 1, 9, 0, 1};
        int [] expectingResult = {2, 1, 9};
        PeakElement pe = new PeakElement();
        int [] actualResult = pe.peakElement(array);
        Assertions.assertArrayEquals(expectingResult, actualResult);
    }
}
