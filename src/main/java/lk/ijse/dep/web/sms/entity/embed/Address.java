package lk.ijse.dep.web.sms.entity.embed;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String no;
    private String address_line1;
    private String address_line2;
    private String city;
}
