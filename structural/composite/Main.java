package structural.composite;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

// Componente abstrato
abstract class ValidationComponent {
    public abstract boolean validate(Object value);
}

// Folhas (Leaf)
class ValidateEmail extends ValidationComponent {
    @Override
    public boolean validate(Object value) {
        if (!(value instanceof String)) return false;
        return Pattern.compile("@").matcher((String) value).find();
    }
}

class ValidateString extends ValidationComponent {
    @Override
    public boolean validate(Object value) {
        return value instanceof String;
    }
}

class ValidateNumber extends ValidationComponent {
    @Override
    public boolean validate(Object value) {
        if (!(value instanceof String)) return false;
        return Pattern.compile("\\d+").matcher((String) value).find();
    }
}

// Composto (Composite)
class ValidationComposite extends ValidationComponent {
    private final List<ValidationComponent> children = new ArrayList<>();

    @Override
    public boolean validate(Object value) {
        for (ValidationComponent child : children) {
            if (!child.validate(value)) {
                return false;
            }
        }
        return true;
    }

    public void add(ValidationComponent... validations) {
        for (ValidationComponent validation : validations) {
            children.add(validation);
        }
    }
}

// Cliente
public class Main {
    public static void main(String[] args) {
        ValidateEmail validateEmail = new ValidateEmail();
        ValidateNumber validateNumber = new ValidateNumber();
        ValidateString validateString = new ValidateString();
        
        ValidationComposite validationComposite = new ValidationComposite();
        validationComposite.add(validateString, validateEmail, validateNumber);

        System.out.println(validationComposite.validate("luiz123@email.com")); // true
        System.out.println(validationComposite.validate("luiz@email.com"));    // false
        System.out.println(validationComposite.validate(12345));               // false
    }
}
