package ca.uqtr.Account.DTO;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class SigninDTO implements Serializable {

    static final long serialVersionUID = 1L;
    @NotNull
    @NotEmpty
    String username;
    @NotNull
    @NotEmpty
    String password;
}
