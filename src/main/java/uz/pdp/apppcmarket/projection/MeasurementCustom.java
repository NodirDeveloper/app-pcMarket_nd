package uz.pdp.apppcmarket.projection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Measurement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Projection(types = Measurement.class)
public interface MeasurementCustom {
    Integer getId();
    String getName();
}
