package uz.pdp.appwarehousedatarest.resource;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.Output;
import uz.pdp.appwarehousedatarest.entity.projection.OutputProjection;

@RepositoryRestResource(excerptProjection = OutputProjection.class)
public interface OutputResource extends CrudRepository<Output, Long> {



}
