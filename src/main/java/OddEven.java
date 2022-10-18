public class OddEven {

    public String OddEven(long number) {
        if (number > Integer.MIN_VALUE && number < Integer.MAX_VALUE) {
            if (number % 2 != 0) {
                return "Odd"; //3,5
            }else if (number % 2 == 0) {
                return "Even";  //2,4
            }
        }
        return "Undefined";
    }
}
