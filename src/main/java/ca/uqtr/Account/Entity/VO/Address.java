package ca.uqtr.Account.Entity.VO;

import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Value
@Embeddable
public class Address {

    @Column(name = "street")
    String street;
    @Column(name = "street_number")
    Integer streetNumber;
    @Column(name = "city")
    String city;
    @Column(name = "postal_code")
    String postalCode;
    @Column(name = "province")
    String province;

}
