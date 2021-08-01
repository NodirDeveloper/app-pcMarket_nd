package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Client;
import uz.pdp.apppcmarket.entity.User;

import javax.persistence.Column;

@Projection(types = User.class)
public interface UserCustom {
    Integer getId();

    String getFullName();

    String getEmail();

    String getPhoneNumber();

    String getPassword();

    String getRoleName();
}
