import java.util.Random;
import java.util.regex.Pattern;

public class TokenGenerator {

    public StringBuilder generateToken(int inputInt) {
        return getTokenFromCharArray(getRandomCharArray(inputInt));
    }

    public StringBuilder getTokenFromCharArray(char[] randomCharArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : randomCharArray) {
            stringBuilder.append(c);
        }
        return stringBuilder;
    }

    public char[] getRandomCharArray(int inputInt) {
        char[] randomCharArray = new char[inputInt];
        for (int i = 0; i < inputInt; i++) {
            randomCharArray[i] = getRandomCharMatchingPattern();
        }
        return randomCharArray;
    }

    public char getRandomCharMatchingPattern() {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9!@#$%^&*()]");
        String charAsString;
        char randomChar;
        do {
            randomChar = (char) new Random().ints(33, 122).findFirst().orElse(0);
            charAsString = Character.toString(randomChar);
        } while (pattern.matcher(charAsString).matches());

        return randomChar;
    }
}
