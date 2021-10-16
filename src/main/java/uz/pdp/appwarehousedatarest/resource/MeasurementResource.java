package uz.pdp.appwarehousedatarest.resource;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.Measurement;
import uz.pdp.appwarehousedatarest.entity.projection.MeasurementProjection;

@RepositoryRestResource(excerptProjection = MeasurementProjection.class)
public interface MeasurementResource extends CrudRepository<Measurement, Long> {



}
