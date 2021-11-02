package uz.pdp.appwarehousedatarest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.core.mapping.ExposureConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import uz.pdp.appwarehousedatarest.entity.*;
import uz.pdp.appwarehousedatarest.validator.*;


@Configuration
public class RepositoryRestConfigure implements RepositoryRestConfigurer {

    @Override
    public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener v) {

        v.addValidator("beforeSave", new WarehouseValidator());
        v.addValidator("beforeCreate", new WarehouseValidator());
        v.addValidator("beforeSave", new UserValidator());
        v.addValidator("beforeCreate", new UserValidator());
        v.addValidator("beforeSave", new SupplierValidator());
        v.addValidator("beforeCreate", new SupplierValidator());
        v.addValidator("beforeSave", new CategoryValidator());
        v.addValidator("beforeCreate", new CategoryValidator());
        v.addValidator("beforeSave", new MeasurementValidator());
        v.addValidator("beforeCreate", new MeasurementValidator());
        v.addValidator("beforeSave", new ProductValidator());
        v.addValidator("beforeCreate", new ProductValidator());
        v.addValidator("beforeSave", new CurrencyValidator());
        v.addValidator("beforeCreate", new CurrencyValidator());
        v.addValidator("beforeSave", new ClientValidator());
        v.addValidator("beforeCreate", new ClientValidator());
        v.addValidator("beforeSave", new OutputValidator());
        v.addValidator("beforeCreate", new OutputValidator());
        v.addValidator("beforeSave", new OutputProductValidator());
        v.addValidator("beforeCreate", new OutputProductValidator());
        v.addValidator("beforeSave", new InputValidator());
        v.addValidator("beforeCreate", new InputValidator());
        v.addValidator("beforeSave", new InputProductValidator());
        v.addValidator("beforeCreate", new InputProductValidator());

    }


    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration restConfig,
                                                     CorsRegistry cors) {

        ExposureConfiguration config = restConfig.getExposureConfiguration();

        config.disablePutForCreation();

        config.forDomainType(User.class).
                withAssociationExposure((metadata, httpMethods) ->
                    httpMethods.disable(HttpMethod.PUT, HttpMethod.PATCH));

        config.forDomainType(Product.class).
                withAssociationExposure((metadata, httpMethods) ->
                        httpMethods.disable(HttpMethod.PATCH, HttpMethod.DELETE));

        config.forDomainType(Output.class).
                withAssociationExposure((metadata, httpMethods) ->
                        httpMethods.disable(HttpMethod.PATCH, HttpMethod.DELETE));

        config.forDomainType(OutputProduct.class).
                withAssociationExposure((metadata, httpMethods) ->
                        httpMethods.disable(HttpMethod.PATCH, HttpMethod.DELETE));

        config.forDomainType(Input.class).
                withAssociationExposure((metadata, httpMethods) ->
                        httpMethods.disable(HttpMethod.PATCH, HttpMethod.DELETE));

        config.forDomainType(InputProduct.class).
                withAssociationExposure((metadata, httpMethods) ->
                        httpMethods.disable(HttpMethod.PATCH, HttpMethod.DELETE));

    }


}

