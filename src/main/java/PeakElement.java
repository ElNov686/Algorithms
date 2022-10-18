
public class PeakElement {
    public static int[] peakElement(int[] array) {
        //{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0 && array[0] > array[1]) {
                 count++;
            } else if (i > 0 && i < array.length - 1 && array[i] > array[i - 1] && array[i] > array[i + 1]) {
                  count++;
            } else if (array[array.length - 1] > array[array.length - 2]) {
                  count++;
            }
        }
        int[] resultArray = new int[count];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0 && array[0] > array[1]) {
                resultArray[k] = array[0];
                k++;
            } else if (i > 0 && i < array.length - 1 && array[i] > array[i - 1] && array[i] > array[i + 1]) {
                resultArray[k] = array[i];
                k++;
            } else if (array[array.length - 1] > array[array.length - 2]) {
                resultArray[k] = array[array.length - 1];
            }
        }
        return resultArray;
    }
}
