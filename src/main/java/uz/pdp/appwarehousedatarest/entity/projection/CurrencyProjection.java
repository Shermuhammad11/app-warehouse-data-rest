package uz.pdp.appwarehousedatarest.entity.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Currency;

@Projection(name = "currencyProjection", types = Currency.class)
public interface CurrencyProjection {

    Long getId();

    String getName();

    String getActive();

}
