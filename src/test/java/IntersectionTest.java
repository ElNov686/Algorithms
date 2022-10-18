import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionTest {
    @Test
    public void intersectionHappyPathPositiveNumber(){
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};
        int[] expectingResult = {2, 4};
        Intersection ins = new Intersection();
        int[] actualResult = ins.intersection(array1, array2);
        Assertions.assertArrayEquals(expectingResult, actualResult);
    }
    @Test
    public void intersectionHappyPathNegativeNumber(){
        int[] array1 = {1, 2, 4, 5, 8, 9};
        int[] array2 = {8, 9, -4, -2};
        int[] expectingResult = {8, 9};
        Intersection ins = new Intersection();
        int[] actualResult = ins.intersection(array1, array2);
        Assertions.assertArrayEquals(expectingResult, actualResult);
    }
    @Test
    public void intersectionHappyPathNoMatchesNumber(){
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 45};
        int[] expectingResult = {};
        Intersection ins = new Intersection();
        int[] actualResult = ins.intersection(array1, array2);
        Assertions.assertArrayEquals(expectingResult, actualResult);
    }
    @Test
    public void intersectionHappyPathManyDublicatesInFirstArray(){
        int[] array1 = {1, 2, 2, 2, 89};
        int[] array2 = {8, 2, 45};
        int[] expectingResult = {2, 2, 2};
        Intersection ins = new Intersection();
        int[] actualResult = ins.intersection(array1, array2);
        Assertions.assertArrayEquals(expectingResult, actualResult);
    }
}
