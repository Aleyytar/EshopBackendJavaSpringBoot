package shop.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.demo.entities.concretes.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

}
