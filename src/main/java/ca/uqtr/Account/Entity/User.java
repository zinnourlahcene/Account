package ca.uqtr.Account.Entity;

import ca.uqtr.Account.Entity.VO.Address;
import ca.uqtr.Account.Entity.VO.Email;
import ca.uqtr.Account.Entity.VO.Institution;
import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Column(name = "firstName")
    String firstName;
    @Column(name = "midlleName")
    String midlleName;
    @Column(name = "lastName")
    String lastName;
    @Temporal(value=TemporalType.DATE)
    @Column(name = "birthday")
    Date birthday;
    @Enumerated(EnumType.STRING)
    @Column(name = "profession")
    Profession profession;
    @Embedded
    Address address;
    @Embedded
    Email email;
    @Embedded
    Institution institution;
    @JoinColumn(name = "account_id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    Account account;
}
