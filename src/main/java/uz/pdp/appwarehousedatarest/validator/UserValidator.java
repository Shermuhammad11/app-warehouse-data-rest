package uz.pdp.appwarehousedatarest.validator;

import org.springframework.lang.NonNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import uz.pdp.appwarehousedatarest.entity.User;


public class UserValidator implements Validator {

    @Override
    public boolean supports(@NonNull Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(@NonNull Object target, @NonNull Errors errors) {

        User user = (User) target;

        if (TypeValidators.check(user.getFirstName()))
            errors.rejectValue("firstName", "User firstName empty");

        if (TypeValidators.check(user.getLastName()))
            errors.rejectValue("lastName", "User lastName empty");

        if (TypeValidators.check(user.getPassword()))
            errors.rejectValue("password", "User password empty");

        if (TypeValidators.check(user.getPhoneNumber()))
            errors.rejectValue("phoneNumber", "User phoneNumber empty");

        if (TypeValidators.check(user.getActive()))
            errors.rejectValue("active", "User active not given");

    }

}
