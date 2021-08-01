package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.apppcmarket.entity.Category;
import uz.pdp.apppcmarket.entity.Company;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
    void deleteAllByParentCategoryId(Category parentCategoryId);

}
