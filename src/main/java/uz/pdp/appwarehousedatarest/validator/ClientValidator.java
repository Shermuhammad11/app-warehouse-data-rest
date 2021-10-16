package uz.pdp.appwarehousedatarest.validator;

import org.springframework.lang.NonNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import uz.pdp.appwarehousedatarest.entity.Client;

public class ClientValidator implements Validator {

    @Override
    public boolean supports(@NonNull Class<?> clazz) {
        return Client.class.equals(clazz);
    }

    @Override
    public void validate(@NonNull Object target, @NonNull Errors errors) {

        Client client = (Client) target;

        if (TypeValidators.check(client.getName()))
            errors.rejectValue("name", "Client name empty");

        if (TypeValidators.check(client.getPhoneNumber()))
            errors.rejectValue("phoneNumber", "Client phone number empty");

        if (TypeValidators.check(client.getActive()))
            errors.rejectValue("active", "Client active not given");

    }

}
