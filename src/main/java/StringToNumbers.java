public class StringToNumbers {
    //Test Data:
    //“1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
    public int[] stringToNumbers(String string){
        String[] str = string.replaceAll("\\[", "")
                .replaceAll("]", "")
                .split(",");
        int[] arr = new int[str.length];
        for(int i = 0; i < str.length; i++) {
            arr[i] = Integer.valueOf(str[i]);
        }

        return arr;
    }
}
