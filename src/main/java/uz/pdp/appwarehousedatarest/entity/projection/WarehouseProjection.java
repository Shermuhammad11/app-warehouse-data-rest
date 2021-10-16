package uz.pdp.appwarehousedatarest.entity.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Warehouse;

@Projection(name = "customWarehouse", types = Warehouse.class)
public interface WarehouseProjection {

    Long getId();

    String getName();

    String getActive();

}
