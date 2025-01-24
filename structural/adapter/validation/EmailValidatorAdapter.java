package structural.adapter.validation;



public class EmailValidatorAdapter implements EmailValidatorProtocol {

  EmailValidator validator = new EmailValidator();

  @Override
  public boolean isEmail(String email) {
    return EmailValidator.isValidEmail(email);
  }
  
}
