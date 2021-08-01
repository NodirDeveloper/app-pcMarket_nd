package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Client;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Projection( types = Client.class)
public interface ClientCustom {
    Integer getId();

    String getName();

    String getAddress();

    String getPhoneNumber();

    String getEmail();
}
