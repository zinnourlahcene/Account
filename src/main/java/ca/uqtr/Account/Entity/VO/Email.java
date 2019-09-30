package ca.uqtr.Account.Entity.VO;

import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Value
@Embeddable
public class Email {

    @Column(name = "email")
    String value;

}
