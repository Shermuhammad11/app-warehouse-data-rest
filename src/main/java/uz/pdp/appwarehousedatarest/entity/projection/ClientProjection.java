package uz.pdp.appwarehousedatarest.entity.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Client;

@Projection(name = "customClient", types = Client.class)
public interface ClientProjection {

    Long getId();

    String getName();

    String getActive();

    String getPhoneNumber();

}
