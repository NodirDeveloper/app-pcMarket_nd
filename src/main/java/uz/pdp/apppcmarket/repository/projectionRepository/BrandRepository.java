package uz.pdp.apppcmarket.repository.projectionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Brand;
import uz.pdp.apppcmarket.projection.BrandCustom;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@RepositoryRestResource(path = "brand",excerptProjection = BrandCustom.class)
public interface BrandRepository extends JpaRepository<Brand,Integer> {


}
