package ca.uqtr.Account.Entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "account")
public class Account extends BaseEntity {

    @Column(name = "username")
    String username;
    @Column(name = "password")
    String password;
    @Column(name = "isActive")
    Boolean isActive;


}
