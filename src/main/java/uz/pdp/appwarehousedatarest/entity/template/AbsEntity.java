package uz.pdp.appwarehousedatarest.entity.template;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@MappedSuperclass
@DynamicUpdate
public abstract class AbsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column
    private Boolean active;

}