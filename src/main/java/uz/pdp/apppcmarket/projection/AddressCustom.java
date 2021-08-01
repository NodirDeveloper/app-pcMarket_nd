package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Address;

@Projection(types = Address.class)
public interface AddressCustom {
    Integer getId();

    String getStreet();

    String getHomeNumber();

    String getRegion();
}
