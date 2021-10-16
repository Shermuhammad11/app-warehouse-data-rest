package uz.pdp.appwarehousedatarest.validator;

import org.springframework.lang.NonNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import uz.pdp.appwarehousedatarest.entity.Input;

public class InputValidator implements Validator {

    @Override
    public boolean supports(@NonNull Class<?> clazz) {
        return Input.class.equals(clazz);
    }

    @Override
    public void validate(@NonNull Object target, @NonNull Errors errors) {

        Input input = (Input) target;

        if (TypeValidators.check(input.getFactureNumber()))
            errors.rejectValue("factureNumber","Input facture Number empty");

        if (TypeValidators.check(input.getSupplier()))
            errors.rejectValue("supplier", "Input Supplier not given");

        if (TypeValidators.check(input.getCurrency()))
            errors.rejectValue("currency","Input Currency not given");

        if (TypeValidators.check(input.getWarehouse()))
            errors.rejectValue("warehouse", "Input Warehouse not given");

    }

}

