public class GoodBadNumber {
    public  String goodBadNumber(Integer m) {
        if (m % 3 == 0 && m % 5 == 0 ){
            return "Good number";
        } else if (m % 3 == 0 && m % 5 != 0) {
            return "Bad number";
        } else if (m % 3 != 0 && m % 5 == 0) {
            return "Poor number";
        } else {
            return "-1";
        }
    }
}
