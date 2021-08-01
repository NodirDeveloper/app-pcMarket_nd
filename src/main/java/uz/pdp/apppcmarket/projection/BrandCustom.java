package uz.pdp.apppcmarket.projection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Brand;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Projection(types = Brand.class)
public interface BrandCustom {
    Integer getId();
    String getName();


}
