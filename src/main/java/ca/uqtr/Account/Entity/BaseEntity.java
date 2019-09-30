package ca.uqtr.Account.Entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator  = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ID", updatable = false, nullable = false)
    UUID id;

    @Version
    @Column(name = "VERSION", nullable = false)
    int version;

   
}