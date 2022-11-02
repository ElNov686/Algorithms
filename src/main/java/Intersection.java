public class Intersection {
    public static int[] intersection(int[] array1, int[] array2) {
        if (array1 == null || array2 == null || array1.length < 1 || array2.length < 1) {
            return new int[]{};
        }
        int l = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    l++;
                }
            }
        }
        int[] array3 = new int[l];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    array3[index] = array1[i];
                    index++;
                }
            }
        }
        return array3;
    }
}
