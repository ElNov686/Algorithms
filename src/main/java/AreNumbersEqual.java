public class AreNumbersEqual {
    public int areNumbersEqual(int a, int b) {
        if (a < b) {
            return -1;
        } else if (b < a) {
            return 1;
        } else {
            return 0;
        }
    }
}
