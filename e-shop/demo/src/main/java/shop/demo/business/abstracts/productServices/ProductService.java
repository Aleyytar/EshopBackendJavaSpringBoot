package shop.demo.business.abstracts.productServices;

import java.util.List;

import shop.demo.business.requests.productRequests.AddProductRequest;
import shop.demo.business.responses.productResponses.GetAllProductResponse;
import shop.demo.business.responses.productResponses.GetProductResponse;

public interface ProductService {
	
	List<GetAllProductResponse> getAll();
	List<GetAllProductResponse> getProductsByProductCategoryId(int id);
	GetProductResponse getProductById(int id);
	void add(AddProductRequest addProductRequest);
	void delete(int id);

}
