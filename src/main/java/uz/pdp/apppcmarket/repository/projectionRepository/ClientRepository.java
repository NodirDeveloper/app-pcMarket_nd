package uz.pdp.apppcmarket.repository.projectionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.entity.Client;
import uz.pdp.apppcmarket.projection.AddressCustom;
import uz.pdp.apppcmarket.projection.ClientCustom;

@RepositoryRestResource(path = "client",excerptProjection = ClientCustom.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {

}
