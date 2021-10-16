package uz.pdp.appwarehousedatarest.resource;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.OutputProduct;
import uz.pdp.appwarehousedatarest.entity.projection.OutputProductProjection;

@RepositoryRestResource(excerptProjection = OutputProductProjection.class)
public interface OutputProductResource extends CrudRepository<OutputProduct, Long> {



}
