package uz.pdp.appwarehousedatarest.validator;

import org.springframework.lang.NonNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import uz.pdp.appwarehousedatarest.entity.Warehouse;

public class WarehouseValidator implements Validator {

    @Override
    public boolean supports(@NonNull Class<?> clazz) {
        return Warehouse.class.equals(clazz);
    }

    @Override
    public void validate(@NonNull Object target, @NonNull Errors errors) {

        Warehouse warehouse = (Warehouse) target;

        if (TypeValidators.check(warehouse.getName()))
            errors.rejectValue("name", "Warehouse.name.empty");

        if (TypeValidators.check(warehouse.getActive()))
            errors.rejectValue("active", "Warehouse active not given");

    }


}
