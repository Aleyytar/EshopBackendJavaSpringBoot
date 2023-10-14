package shop.demo.business.abstracts.productServices;

import java.util.List;

import shop.demo.business.requests.productDislikeRequests.AddProductDislikeRequest;
import shop.demo.business.responses.productDislikeResponses.GetProductDislikeResponse;

public interface ProductDislikeService {
	
	List<GetProductDislikeResponse> getProductDislikeByProductId(int id);
	
	void add(AddProductDislikeRequest addProductDislikeRequest);
	void delete(int id);

}
