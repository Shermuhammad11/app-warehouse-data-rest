package uz.pdp.appwarehousedatarest.resource;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.Input;

@RepositoryRestResource(excerptProjection = Input.class)
public interface InputResource extends CrudRepository<Input, Long> {



}
