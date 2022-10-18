import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {
    @Test
    public void minMaxAveHappyPath(){
        int[] newArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 2;
        int end = 6;
        MinMaxAve ave = new  MinMaxAve();
        int[] actualResult = ave.minMaxAve(newArray, 2, 6);
        int[] expectedResult = new int []{3, 7, 5};
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void minMaxAveEmptyArray(){
        int[] newArray = {};
        int start = 2;
        int end = 6;
        MinMaxAve ave = new  MinMaxAve();
        int[] actualResult = ave.minMaxAve(newArray, 2, 6);
        int[] expectedResult = new int []{};
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void minMaxAveIsNegative(){
        int[] newArray = {5, 4, 7, 10};
        int start = -2;
        int end = 6;
        MinMaxAve ave = new  MinMaxAve();
        int[] actualResult = ave.minMaxAve(newArray, -2, 6);
        int[] expectedResult = new int[]{};
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void minMaxAveIsNegative2(){
        int[] newArray = {5, 4, 7, 10};
        int start = 2;
        int end = -6;
        MinMaxAve ave = new  MinMaxAve();
        int[] actualResult = ave.minMaxAve(newArray, 2, -6);
        int[] expectedResult = new int[]{};
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void minMaxAve1IsBiggerThen2(){
        int[] newArray = {5, 4, 7, 10};
        int start = 3;
        int end = 2;
        MinMaxAve ave = new  MinMaxAve();
        int[] actualResult = ave.minMaxAve(newArray, start, end);
        int[] expectedResult = new int[]{};
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void minMaxAveIndex1EqualsIndex2(){
        int[] newArray = {5, 4, 7, 10};
        int start = 3;
        int end = 3;
        MinMaxAve ave = new  MinMaxAve();
        int[] actualResult = ave.minMaxAve(newArray, start, end);
        int[] expectedResult = {10, 10, 10};
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void minMaxAveIndexIsEquals(){
        int[] newArray = {5, 4, 7, 10};
        int start = 2;
        int end = 2;
        MinMaxAve ave = new  MinMaxAve();
        int[] actualResult = ave.minMaxAve(newArray, 2, 2);
        int[] expectedResult = new int[]{7, 7, 7};
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void minMaxAveLengthEqualsZero(){
        int[] newArray = {2};
        int start = 0;
        int end = 0;
        MinMaxAve ave = new  MinMaxAve();
        int[] actualResult = ave.minMaxAve(newArray, start, end);
        int[] expectedResult = {2, 2, 2};
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void minMaxAveArrayZeroValues(){
        int[] newArray = {0, 0, 0, 0};
        int start = 3;
        int end = 2;
        MinMaxAve ave = new  MinMaxAve();
        int[] actualResult = ave.minMaxAve(newArray, start, end);
        int[] expectedResult = {0, 0, 0};
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void minMaxAveArrayTwoValues(){
        int[] newArray = {4,20};
        int start = 0;
        int end = 3;
        MinMaxAve ave = new  MinMaxAve();
        int[] actualResult = ave.minMaxAve(newArray, start, end);
        int[] expectedResult = {};
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
