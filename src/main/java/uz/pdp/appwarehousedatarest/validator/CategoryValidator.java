package uz.pdp.appwarehousedatarest.validator;

import org.springframework.lang.NonNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import uz.pdp.appwarehousedatarest.entity.Category;


public class CategoryValidator implements Validator {

    @Override
    public boolean supports(@NonNull Class<?> clazz) {
        return Category.class.equals(clazz);
    }

    @Override
    public void validate(@NonNull Object target, @NonNull Errors errors) {

        Category category = (Category) target;

        if (TypeValidators.check(category.getName()))
            errors.rejectValue("name", "Category name empty");

        if (TypeValidators.check(category.getActive()))
            errors.rejectValue("active", "Category active not given");

    }

}
