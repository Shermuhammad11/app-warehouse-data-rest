package uz.pdp.appwarehousedatarest.entity;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appwarehousedatarest.entity.template.AbsEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends AbsEntity {

    @ManyToOne(optional = false)
    private Category category;

    @OneToOne
    private Attachment attachment;

    @Column(nullable = false, unique = true, updatable = false)
    private String code;

    @ManyToOne(optional = false)
    private Measurement measurement;

    @JsonGetter
    public String getCode() {
        return code;
    }

    @JsonIgnore
    public void setCode(String code) {
        this.code = code;
    }

}

