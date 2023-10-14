package shop.demo.entities.concretes.photos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shop.demo.entities.concretes.Product;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="productPhotos")
public class ProductPhoto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="url")
	private String url;
	
	@ManyToOne()
	@JoinColumn(name="productId")
	private Product product;
	
}
