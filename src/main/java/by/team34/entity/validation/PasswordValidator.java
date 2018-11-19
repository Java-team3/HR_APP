package by.team34.entity.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator
        implements ConstraintValidator<Password, String> {

    @Override
    public final void initialize(final Password paramA) {
    }

    @Override
    public final boolean isValid(final String password,
                                 final ConstraintValidatorContext ctx) {
        if (password == null) {
            return false;
        }
        return password.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,20})");
    }

}