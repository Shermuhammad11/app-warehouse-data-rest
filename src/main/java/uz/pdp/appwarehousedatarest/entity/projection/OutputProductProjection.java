package uz.pdp.appwarehousedatarest.entity.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.OutputProduct;

@Projection(name = "customOutputProduct", types = OutputProduct.class)
public interface OutputProductProjection {

    Long getId();

    Double getAmount();

    Double getPrice();

}
