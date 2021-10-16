package uz.pdp.appwarehousedatarest.resource;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.Client;
import uz.pdp.appwarehousedatarest.entity.projection.ClientProjection;

@RepositoryRestResource(excerptProjection = ClientProjection.class)
public interface ClientResource extends CrudRepository<Client, Long> {



}
