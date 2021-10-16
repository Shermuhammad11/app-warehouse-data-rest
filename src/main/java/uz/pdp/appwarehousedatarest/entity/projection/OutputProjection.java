package uz.pdp.appwarehousedatarest.entity.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Output;

import java.time.LocalDateTime;

@Projection(name = "customOutput", types = Output.class)
public interface OutputProjection {

    Long getId();

    LocalDateTime getDateTime();

    String getFactureNumber();

    String getCode();

}
