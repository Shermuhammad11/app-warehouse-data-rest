package uz.pdp.appwarehousedatarest.entity.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Supplier;

@Projection(name = "customSupplier", types = Supplier.class)
public interface SupplierProjection {

    Long getId();

    String getName();

    String getActive();

    String getPhoneNumber();

}
