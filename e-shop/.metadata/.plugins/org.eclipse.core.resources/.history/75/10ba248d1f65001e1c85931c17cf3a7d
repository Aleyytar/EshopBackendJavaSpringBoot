package shop.demo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.demo.entities.concretes.ProductDislike;

public interface ProductDislikeRepository extends JpaRepository<ProductDislike, Integer> {
	
	List<ProductDislike> getProductDislikesByProductId(int id);

}
