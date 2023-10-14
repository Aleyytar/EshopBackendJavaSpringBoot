package shop.demo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.demo.entities.concretes.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> getProductsByProductCategoryId(int id);

}
