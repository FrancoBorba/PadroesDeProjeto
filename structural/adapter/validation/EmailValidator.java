package structural.adapter.validation;
import java.util.regex.Pattern;

// esta classe simula uma bibliotece externa , assim a classe EmailValidatorAdapter importa ela
// simulando o adapter 

public class EmailValidator {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public static boolean isValidEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

 
}
