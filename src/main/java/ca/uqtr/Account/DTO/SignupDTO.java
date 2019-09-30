package ca.uqtr.Account.DTO;

import ca.uqtr.Account.Entity.Account;
import ca.uqtr.Account.Entity.Profession;
import ca.uqtr.Account.Entity.VO.Address;
import ca.uqtr.Account.Entity.VO.Email;
import ca.uqtr.Account.Entity.VO.Institution;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
public class SignupDTO implements Serializable {

    static final long serialVersionUID = 1L;
    @NotNull
    @NotEmpty
    String firstName;
    @NotNull
    @NotEmpty
    String midlleName;
    @NotNull
    @NotEmpty
    String lastName;
    @NotNull
    @NotEmpty
    Date birthday;
    @NotNull
    @NotEmpty
    Profession profession;
    @NotNull
    @NotEmpty
    Address address;
    @NotNull
    @NotEmpty
    Email email;
    @NotNull
    @NotEmpty
    Institution institution;
}
