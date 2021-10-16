package uz.pdp.appwarehousedatarest.validator;

import org.springframework.lang.NonNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import uz.pdp.appwarehousedatarest.entity.Currency;

public class CurrencyValidator implements Validator {

    @Override
    public boolean supports(@NonNull Class<?> clazz) {
        return Currency.class.equals(clazz);
    }


    @Override
    public void validate(@NonNull Object target, @NonNull Errors errors) {

        Currency currency = (Currency) target;

        if (TypeValidators.check(currency.getName()))
            errors.rejectValue("name", "Currency name empty");

        if (TypeValidators.check(currency.getActive()))
            errors.rejectValue("active", "Currency active not given");

    }

}
