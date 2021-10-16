package uz.pdp.appwarehousedatarest.eventHandlers;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;
import uz.pdp.appwarehousedatarest.entity.*;
import uz.pdp.appwarehousedatarest.validator.TypeValidators;

import java.time.LocalDateTime;


@Component
@RepositoryEventHandler
public class EventHandler{


    @HandleBeforeCreate
    public void handleUserCreate(User user){
        user.setCode(TypeValidators.generateCode());
        if (TypeValidators.check(user.getActive()))
            user.setActive(true);
    }

    @HandleBeforeCreate
    public void handleSupplierCreate(Supplier supplier){
        if (TypeValidators.check(supplier.getActive()))
            supplier.setActive(true);
    }

    @HandleBeforeCreate
    public void handleWarehouseCreate(Warehouse warehouse){
        if (TypeValidators.check(warehouse.getActive()))
            warehouse.setActive(true);
    }

    @HandleBeforeCreate
    public void handleCategoryCreate(Category category){
        if (TypeValidators.check(category.getActive()))
            category.setActive(true);
    }

    @HandleBeforeCreate
    public void handleMeasurementCreate(Measurement measurement){
        if (TypeValidators.check(measurement.getActive()))
            measurement.setActive(true);
    }

    @HandleBeforeCreate
    public void handleProductCreate(Product product){
        product.setCode(TypeValidators.generateCode());
        if (TypeValidators.check(product.getActive()))
            product.setActive(true);
    }

    @HandleBeforeCreate
    public void handleCurrencyCreate(Currency currency){
        if (TypeValidators.check(currency.getActive()))
            currency.setActive(true);
    }

    @HandleBeforeCreate
    public void handleClientCreate(Client client){
        if (TypeValidators.check(client.getActive()))
            client.setActive(true);
    }

    @HandleBeforeCreate
    public void handleOutputCreate(Output output){
        output.setCode(TypeValidators.generateCode());
        output.setDateTime(LocalDateTime.now());
    }

    @HandleBeforeCreate
    public void handleInputCreate(Input input){
        input.setCode(TypeValidators.generateCode());
        input.setDateTime(LocalDateTime.now());
    }

}
