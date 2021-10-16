package uz.pdp.appwarehousedatarest.entity.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Measurement;

@Projection(name = "customMeasurement", types = Measurement.class)
public interface MeasurementProjection {

    Long getId();

    String getName();

    String getActive();

}
