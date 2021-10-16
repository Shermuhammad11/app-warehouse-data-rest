package uz.pdp.appwarehousedatarest.entity.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Category;

@Projection(name = "customCategory", types = Category.class)
public interface CategoryProjection {

    Long getId();

    String getName();

    String getActive();

}
