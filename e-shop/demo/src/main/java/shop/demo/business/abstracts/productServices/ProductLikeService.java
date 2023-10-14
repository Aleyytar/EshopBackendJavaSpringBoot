package shop.demo.business.abstracts.productServices;

import java.util.List;

import shop.demo.business.requests.productLikeRequests.AddProductLikeRequest;
import shop.demo.business.responses.productLikeResponses.GetProductLikeRespone;

public interface ProductLikeService {
	
	List<GetProductLikeRespone> getProductLikeByProductId(int id);
	void add(AddProductLikeRequest addProductLikeRequest);
	void delete(int id);

}
