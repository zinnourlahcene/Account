package ca.uqtr.Account.Entity.VO;

import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Value
@Embeddable
public class Address {

    @Column(name = "street")
    String street;
    @Column(name = "streetNumber")
    String streetNumber;
    @Column(name = "city")
    String city;
    @Column(name = "postalCode")
    String postalCode;
    @Column(name = "province")
    String province;

}
