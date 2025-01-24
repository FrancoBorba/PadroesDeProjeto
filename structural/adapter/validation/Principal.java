package structural.adapter.validation;

public class Principal {
  public static void main(String[] args) {
    EmailValidatorAdapter validator = new EmailValidatorAdapter();

    System.out.println(validator.isEmail("email@exemplo.com")); // true
    System.out.println(validator.isEmail("email_invalido.com")); // false
  }
}