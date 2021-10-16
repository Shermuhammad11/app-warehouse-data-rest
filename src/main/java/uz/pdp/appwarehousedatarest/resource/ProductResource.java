package uz.pdp.appwarehousedatarest.resource;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.Product;
import uz.pdp.appwarehousedatarest.entity.projection.ProductProjection;

@RepositoryRestResource(excerptProjection = ProductProjection.class)
public interface ProductResource extends CrudRepository<Product, Long> {



}
