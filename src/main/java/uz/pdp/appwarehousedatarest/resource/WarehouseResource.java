package uz.pdp.appwarehousedatarest.resource;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.Warehouse;
import uz.pdp.appwarehousedatarest.entity.projection.WarehouseProjection;

@RepositoryRestResource(path = "warehouses", excerptProjection = WarehouseProjection.class)
public interface WarehouseResource extends CrudRepository<Warehouse, Long> {


}
