package uz.pdp.appwarehousedatarest.resource;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.User;
import uz.pdp.appwarehousedatarest.entity.projection.CustomUser;

@RepositoryRestResource(excerptProjection = CustomUser.class)
public interface UserResource extends CrudRepository<User, Long> {



}
