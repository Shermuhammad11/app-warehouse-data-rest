package uz.pdp.appwarehousedatarest.resource;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.Currency;
import uz.pdp.appwarehousedatarest.entity.projection.CurrencyProjection;

@RepositoryRestResource(excerptProjection = CurrencyProjection.class)
public interface CurrencyResource extends CrudRepository<Currency, Long> {



}
