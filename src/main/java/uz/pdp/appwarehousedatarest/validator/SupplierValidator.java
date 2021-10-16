package uz.pdp.appwarehousedatarest.validator;

import org.springframework.lang.NonNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import uz.pdp.appwarehousedatarest.entity.Supplier;

public class SupplierValidator implements Validator {

    @Override
    public boolean supports(@NonNull Class<?> clazz) {
        return Supplier.class.equals(clazz);
    }

    @Override
    public void validate(@NonNull Object target, @NonNull Errors errors) {

        Supplier supplier = (Supplier) target;

        if (TypeValidators.check(supplier.getName()))
            errors.rejectValue("name", "Supplier name empty");

        if (TypeValidators.check(supplier.getPhoneNumber()))
            errors.rejectValue("phoneNumber", "Supplier phoneNumber empty");

        if (TypeValidators.check(supplier.getActive()))
            errors.rejectValue("active", "Supplier active not given");

    }


}
