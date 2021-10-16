package uz.pdp.appwarehousedatarest.validator;

import org.springframework.lang.NonNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import uz.pdp.appwarehousedatarest.entity.Output;

public class OutputValidator implements Validator {

    @Override
    public boolean supports(@NonNull Class<?> clazz) {
        return Output.class.equals(clazz);
    }

    @Override
    public void validate(@NonNull Object target, @NonNull Errors errors) {

        Output output = (Output) target;

        if (TypeValidators.check(output.getFactureNumber()))
            errors.rejectValue("factureNumber","Output facture Number empty");

        if (TypeValidators.check(output.getClient()))
            errors.rejectValue("client", "Output Client not given");

        if (TypeValidators.check(output.getCurrency()))
            errors.rejectValue("currency","Output Currency not given");

        if (TypeValidators.check(output.getWarehouse()))
            errors.rejectValue("warehouse", "Output Warehouse not given");

    }

}
