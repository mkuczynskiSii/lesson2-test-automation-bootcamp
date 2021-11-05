import java.util.List;

public class InputValidator {

    public boolean isInputValid(int inputInt, List<Integer> allowedInputIntList) {
        return allowedInputIntList.contains(inputInt);
    }
}
