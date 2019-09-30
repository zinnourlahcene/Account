package ca.uqtr.Account.Entity.VO;


import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Value
@Embeddable
public class Institution {

    @Column(name = "institutionName")
    String institutionName;
    @Column(name = "institutionCode")
    String institutionCode;

}
