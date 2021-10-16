package uz.pdp.appwarehousedatarest.validator;

import org.springframework.lang.NonNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import uz.pdp.appwarehousedatarest.entity.InputProduct;

public class InputProductValidator implements Validator {

    @Override
    public boolean supports(@NonNull Class<?> clazz) {
        return InputProduct.class.equals(clazz);
    }

    @Override
    public void validate(@NonNull Object target, @NonNull Errors errors) {

        InputProduct inputProduct = (InputProduct) target;

        if (TypeValidators.check(inputProduct.getPrice()))
            errors.rejectValue("price", "InputProduct price not given");

        if (TypeValidators.check(inputProduct.getAmount()))
            errors.rejectValue("amount", "InputProduct amount not given");

        if (TypeValidators.check(inputProduct.getExpireDate()))
            errors.rejectValue("expireDate", "InputProduct expire date not given");

        if (TypeValidators.check(inputProduct.getInput()))
            errors.rejectValue("input", "InputProduct input not given");

        if (TypeValidators.check(inputProduct.getProduct()))
            errors.rejectValue("product", "InputProduct product not given");

    }

}
