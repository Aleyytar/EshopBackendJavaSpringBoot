package shop.demo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.demo.entities.concretes.photos.ProductPhoto;

public interface ProductPhotoRepository extends JpaRepository<ProductPhoto, Integer> {
	
	List<ProductPhoto> getProductPhotosByProductId(int id);

}
