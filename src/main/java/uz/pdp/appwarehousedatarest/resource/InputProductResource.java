package uz.pdp.appwarehousedatarest.resource;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.InputProduct;
import uz.pdp.appwarehousedatarest.entity.projection.InputProductProjection;

@RepositoryRestResource(excerptProjection = InputProductProjection.class)
public interface InputProductResource extends CrudRepository<InputProduct, Long> {



}
