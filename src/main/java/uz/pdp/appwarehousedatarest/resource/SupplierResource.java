package uz.pdp.appwarehousedatarest.resource;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.Supplier;
import uz.pdp.appwarehousedatarest.entity.projection.SupplierProjection;

@RepositoryRestResource(excerptProjection = SupplierProjection.class)
public interface SupplierResource extends CrudRepository<Supplier, Long> {



}
