import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class PasswordGenerator {

    private static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*_=+-/";
    private static final int MIN_LENGTH = 8;
    private static final int MAX_LENGTH = 64;

    private static SecureRandom random = new SecureRandom();

    public static String generatePassword() {
        List<String> charSets = Arrays.asList(LOWERCASE_LETTERS, UPPERCASE_LETTERS, NUMBERS, SYMBOLS);
        int length = MIN_LENGTH + random.nextInt(MAX_LENGTH - MIN_LENGTH + 1);
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            String charSet = charSets.get(random.nextInt(charSets.size()));
            int index = random.nextInt(charSet.length());
            password.append(charSet.charAt(index));
        }

        password.setCharAt(random.nextInt(length), LOWERCASE_LETTERS.charAt(random.nextInt(26)));
        password.setCharAt(random.nextInt(length), UPPERCASE_LETTERS.charAt(random.nextInt(26)));
        password.setCharAt(random.nextInt(length), NUMBERS.charAt(random.nextInt(10)));
        password.setCharAt(random.nextInt(length), SYMBOLS.charAt(random.nextInt(SYMBOLS.length())));

        return password.toString();
    }
}

