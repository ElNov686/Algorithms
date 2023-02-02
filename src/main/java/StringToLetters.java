public class StringToLetters {
    public char[] StringToLetters(String string) {
        string = string.replaceAll("[^a-zA-Z\\s]", "");

        return string.toCharArray();
    }
    public char[] StringToLettersAndSpaces(String string) {
        String[] str = string.replaceAll("[\\D|\\S]", "").split(",");

        return string.toCharArray();

    }
}
