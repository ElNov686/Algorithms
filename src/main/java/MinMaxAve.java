public class MinMaxAve {
    public static int[] minMaxAve(int[] array, int start, int end){
        if (array == null || array.length <1 || start < 0 || end > array.length || start > end){
            return new int[]{};
        }
        if (start > end){
            int tmp = start;
            end = start;
            start = tmp;
        }
        int minValue = array[start];
        int maxValue = array[end];
        int midValue = 0;
        int sum = 0;
        for(int i = start; i<= end; i++) {
            if (array[start] < array[i]) {
                maxValue = array[i];
            }
            if (array[start] > array[i]) {
                minValue = array[i];
            }
            sum += array[i];

        }
        midValue = sum / (end - start + 1);
        int[]  result2 = {minValue, maxValue, midValue};
        return result2;
    }
}
