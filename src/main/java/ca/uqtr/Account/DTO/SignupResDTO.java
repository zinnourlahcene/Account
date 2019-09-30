package ca.uqtr.Account.DTO;

public class SignupResDTO {

    Boolean emailExist;
    Boolean professionIsSet;
    Boolean isSignup;

    public SignupResDTO() {
    }

    public void setEmailExist(Boolean emailExist) {
        this.emailExist = emailExist;
    }

    public void setProfessionIsSet(Boolean professionIsSet) {
        this.professionIsSet = professionIsSet;
    }

    public void isSignup(Boolean signup) {
        isSignup = signup;
    }
}
