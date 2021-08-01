package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.apppcmarket.entity.Basket;
import uz.pdp.apppcmarket.entity.Company;

public interface BasketRepository extends JpaRepository<Basket,Integer> {


}
