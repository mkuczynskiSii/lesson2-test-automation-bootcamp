import java.util.*;

public class TokenGeneratorApp {

    public static void main(String[] args) {
        TokenGenerator tokenGenerator = new TokenGenerator();
        InputValidator inputValidator = new InputValidator();

        List<Integer> allowedInputNumbersList = getAllowedInputNumbersList();

        do {
            System.out.println("Enter the number of chars you want your token to be made of.");
            System.out.println("Available options are 5, 10 or 15");
            try {
                int inputInt = new Scanner(System.in).nextInt();

                if (inputValidator.isInputValid(inputInt, allowedInputNumbersList)) {
                    System.out.println("Here is your token: " + tokenGenerator.generateToken(inputInt));
                } else {
                    System.out.println("You have entered not allowed number");
                    System.out.println("Available options are: 5, 10 or 15");
                }
                System.out.println("Would you like to get next token? Enter yes/no");

            } catch (InputMismatchException e) {
                System.out.println("Error.You can enter only integers here!");
                System.out.println("Would you like to try again? Enter yes/no");
            }
        } while (doesUserWantToGenerateNextToken());
        System.out.println("Thank you for using this simple program");
        System.out.println("Hope you got your answer ;)");
    }

    private static List<Integer> getAllowedInputNumbersList() {
        List<Integer> allowedInputNumbersList = new ArrayList<>();
        allowedInputNumbersList.add(5);
        allowedInputNumbersList.add(10);
        allowedInputNumbersList.add(15);
        return allowedInputNumbersList;
    }

    private static boolean doesUserWantToGenerateNextToken(){
        try {
            String inputString = new Scanner(System.in).nextLine();

            switch (inputString.toLowerCase()) {
                case "yes":
                    return true;
                case "no":
                    return false;
                default:
                    System.out.println("********************************");
                    System.out.println("Available options are: yes or no");
                    System.out.println("********************************");
                    System.out.println("        Please try again        ");
                    System.out.println("********************************");
                    return true;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error.You can enter only letters here!");
            return false;
        }
    }
}
