package shop.demo.business.requests.photoRequests.productPhotoRequests;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddProductPhotoRequest {

	private int productId;
	private MultipartFile url;
	
}
