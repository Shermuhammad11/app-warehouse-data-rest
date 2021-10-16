package uz.pdp.appwarehousedatarest.entity;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Input {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dateTime;

    @ManyToOne(optional = false)
    private Warehouse warehouse;

    @ManyToOne(optional = false)
    private Supplier supplier;

    @ManyToOne(optional = false)
    private Currency currency;

    @Column(nullable = false)
    private String factureNumber;

    @Column(unique = true, nullable = false, updatable = false)
    private String code;

    @JsonGetter
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @JsonIgnore
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @JsonGetter
    public String getCode() {
        return code;
    }

    @JsonIgnore
    public void setCode(String code) {
        this.code = code;
    }

}
