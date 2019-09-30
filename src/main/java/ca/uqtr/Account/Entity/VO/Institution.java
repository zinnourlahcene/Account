package ca.uqtr.Account.Entity.VO;


import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Value
@Embeddable
public class Institution {

    @Column(name = "institution_name")
    String institutionName;
    @Column(name = "institution_code")
    String institutionCode;

}
