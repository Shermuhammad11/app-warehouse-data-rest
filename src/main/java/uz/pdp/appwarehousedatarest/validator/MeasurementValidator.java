package uz.pdp.appwarehousedatarest.validator;

import org.springframework.lang.NonNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import uz.pdp.appwarehousedatarest.entity.Measurement;

public class MeasurementValidator implements Validator {

    @Override
    public boolean supports(@NonNull Class<?> clazz) {
        return Measurement.class.equals(clazz);
    }

    @Override
    public void validate(@NonNull Object target, @NonNull Errors errors) {

        Measurement measurement = (Measurement) target;

        if (TypeValidators.check(measurement.getName()))
            errors.rejectValue("name", "Measurement name empty");

        if (TypeValidators.check(measurement.getActive()))
            errors.rejectValue("active", "Measurement active not given");

    }

}
