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

    @Column(name = "first_name")
    String firstName;
    @Column(name = "midlle_name")
    String midlleName;
    @Column(name = "last_name")
    String lastName;
    @Temporal(value=TemporalType.DATE)
    @Column(name = "birthday")
    Date birthday;
    @Enumerated(EnumType.STRING)
    @Column(name = "profile")
    Profile profile;
    @Embedded
    Address address;
    @Embedded
    Email email;
    @Embedded
    Institution institution;
    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    Account account;
}
