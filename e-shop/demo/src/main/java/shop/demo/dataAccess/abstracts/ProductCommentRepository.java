package shop.demo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.demo.entities.concretes.ProductComment;

public interface ProductCommentRepository extends JpaRepository<ProductComment, Integer> {
	
	List<ProductComment> getProductCommentsByProductId(int id);

}
