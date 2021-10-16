package uz.pdp.appwarehousedatarest.entity.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Input;

import java.time.LocalDateTime;

@Projection(name = "customInput", types = Input.class)
public interface InputProjection {

    Long getId();

    LocalDateTime getLocalDateTime();

    String getFactureNumber();

    String getCode();

}
