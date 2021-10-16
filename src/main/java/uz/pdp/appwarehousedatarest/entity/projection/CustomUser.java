package uz.pdp.appwarehousedatarest.entity.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.User;

@Projection(name = "customUser1", types = User.class)
public interface CustomUser {

    Long getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    Boolean getActive();

}
