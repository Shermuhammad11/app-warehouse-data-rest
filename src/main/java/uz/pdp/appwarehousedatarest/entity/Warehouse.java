package uz.pdp.appwarehousedatarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicUpdate;
import uz.pdp.appwarehousedatarest.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@DynamicUpdate
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"name"})})
public class Warehouse extends AbsEntity {



}