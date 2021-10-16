package uz.pdp.appwarehousedatarest.entity.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.InputProduct;

import java.time.LocalDate;

@Projection(name = "customInputProduct", types = InputProduct.class)
public interface InputProductProjection {

    Long getId();

    Double getAmount();

    Double getPrice();

    LocalDate getExpireDate();

}
