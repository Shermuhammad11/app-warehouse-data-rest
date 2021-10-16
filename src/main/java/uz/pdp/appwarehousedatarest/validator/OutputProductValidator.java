package uz.pdp.appwarehousedatarest.validator;

import org.springframework.lang.NonNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import uz.pdp.appwarehousedatarest.entity.OutputProduct;

public class OutputProductValidator implements Validator {

    @Override
    public boolean supports(@NonNull Class<?> clazz) {
        return OutputProduct.class.equals(clazz);
    }

    @Override
    public void validate(@NonNull Object target, @NonNull Errors errors) {

        OutputProduct outputProduct = (OutputProduct) target;

        if (TypeValidators.check(outputProduct.getPrice()))
            errors.rejectValue("price", "OutputProduct price not given");

        if (TypeValidators.check(outputProduct.getAmount()))
            errors.rejectValue("amount", "OutputProduct amount not given");

        if (TypeValidators.check(outputProduct.getOutput()))
            errors.rejectValue("output", "OutputProduct output not given");

        if (TypeValidators.check(outputProduct.getProduct()))
            errors.rejectValue("product", "OutputProduct product not given");

    }

}
