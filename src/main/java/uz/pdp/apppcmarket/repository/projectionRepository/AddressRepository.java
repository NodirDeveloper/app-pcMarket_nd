package uz.pdp.apppcmarket.repository.projectionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.projection.AddressCustom;

@RepositoryRestResource(path = "address",excerptProjection = AddressCustom.class)
public interface AddressRepository extends JpaRepository<Address,Integer> {

}
