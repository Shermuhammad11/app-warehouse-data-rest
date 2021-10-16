package uz.pdp.appwarehousedatarest.resource;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.Category;
import uz.pdp.appwarehousedatarest.entity.projection.CategoryProjection;

@RepositoryRestResource(excerptProjection = CategoryProjection.class)
public interface CategoryResource extends CrudRepository<Category, Long> {



}
