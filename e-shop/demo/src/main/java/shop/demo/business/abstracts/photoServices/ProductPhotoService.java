package shop.demo.business.abstracts.photoServices;

import java.util.List;

import shop.demo.business.requests.photoRequests.productPhotoRequests.AddProductPhotoRequest;
import shop.demo.business.responses.photosResponses.productPhotoResponses.GetAllProductPhotosByProductResponse;

public interface ProductPhotoService {

	void add(AddProductPhotoRequest addProductPhotoRequest);
	
	List<GetAllProductPhotosByProductResponse> getProductPhotosByProductId(int id);
	
}
