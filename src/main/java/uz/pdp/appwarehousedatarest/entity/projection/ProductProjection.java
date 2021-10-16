package uz.pdp.appwarehousedatarest.entity.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Product;

@Projection(name = "customProduct", types = Product.class)
public interface ProductProjection {

    Long getId();

    String getName();

    String getActive();

    String getCode();



}
