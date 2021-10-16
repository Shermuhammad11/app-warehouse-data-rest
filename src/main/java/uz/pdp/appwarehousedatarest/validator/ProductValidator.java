package uz.pdp.appwarehousedatarest.validator;

import org.springframework.lang.NonNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import uz.pdp.appwarehousedatarest.entity.Product;

public class ProductValidator implements Validator {

    @Override
    public boolean supports(@NonNull Class<?> clazz) {
        return Product.class.equals(clazz);
    }

    @Override
    public void validate(@NonNull Object target, @NonNull Errors errors) {

        Product product = (Product) target;

        if (TypeValidators.check(product.getName()))
            errors.rejectValue("name", "Product name empty");

        if (TypeValidators.check(product.getActive()))
            errors.rejectValue("active", "Product active not given");

        if (TypeValidators.check(product.getCategory()))
            errors.rejectValue("category", "Product Category not given");

        if (TypeValidators.check(product.getMeasurement()))
            errors.rejectValue("measurement", "Product Measurement not given");

    }


}
