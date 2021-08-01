package uz.pdp.apppcmarket.repository.projectionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Measurement;
import uz.pdp.apppcmarket.projection.MeasurementCustom;

@RepositoryRestResource(path = "measurement",excerptProjection = MeasurementCustom.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {

}
