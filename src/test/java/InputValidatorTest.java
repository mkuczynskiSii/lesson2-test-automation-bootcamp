import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class InputValidatorTest extends InputValidator {

    private static final InputValidator inputValidator = new InputValidator();



    @Test
    public void testCheckValidInputShouldReturnTrue() {
        Assert.assertTrue(inputValidator.isInputValid(5, createAllowedInputIntegerList()));
        Assert.assertTrue(inputValidator.isInputValid(10, createAllowedInputIntegerList()));
        Assert.assertTrue(inputValidator.isInputValid(15, createAllowedInputIntegerList()));
    }

    @Test
    public void testCheckInvalidInputShouldReturnFalse() {
        Assert.assertFalse(inputValidator.isInputValid(-5, createAllowedInputIntegerList()));
        Assert.assertFalse(inputValidator.isInputValid(11, createAllowedInputIntegerList()));
        Assert.assertFalse(inputValidator.isInputValid(0, createAllowedInputIntegerList()));
    }

    private List<Integer> createAllowedInputIntegerList(){
        List<Integer> allowedInputNumbersList = new ArrayList<>();
        allowedInputNumbersList.add(5);
        allowedInputNumbersList.add(10);
        allowedInputNumbersList.add(15);
        return allowedInputNumbersList;
    }

}
