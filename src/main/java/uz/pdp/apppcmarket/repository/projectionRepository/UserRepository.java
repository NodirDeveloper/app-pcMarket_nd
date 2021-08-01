package uz.pdp.apppcmarket.repository.projectionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Client;
import uz.pdp.apppcmarket.entity.User;
import uz.pdp.apppcmarket.projection.ClientCustom;
import uz.pdp.apppcmarket.projection.UserCustom;

@RepositoryRestResource(path = "user",excerptProjection = UserCustom.class)
public interface UserRepository extends JpaRepository<User,Integer> {

}
