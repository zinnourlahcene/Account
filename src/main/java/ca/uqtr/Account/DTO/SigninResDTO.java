package ca.uqtr.Account.DTO;

public class SigninResDTO {

    Boolean userNameExist;
    Boolean passwordIsTrue;

    public SigninResDTO() {
    }

    public void setUserNameExist(Boolean userNameExist) {
        this.userNameExist = userNameExist;
    }

    public void setPasswordIsTrue(Boolean passwordIsTrue) {
        this.passwordIsTrue = passwordIsTrue;
    }
}
