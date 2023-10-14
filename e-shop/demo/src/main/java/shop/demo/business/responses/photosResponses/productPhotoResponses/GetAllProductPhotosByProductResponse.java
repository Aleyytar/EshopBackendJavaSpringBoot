package shop.demo.business.responses.photosResponses.productPhotoResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProductPhotosByProductResponse {

	private int id;
	private String url;
	
}
