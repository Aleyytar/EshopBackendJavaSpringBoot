package shop.demo.business.abstracts.productServices;

import java.util.List;

import shop.demo.business.requests.productCategoryRequests.AddProductCategoryRequest;
import shop.demo.business.requests.productCategoryRequests.UpdateProductCategoryRequest;
import shop.demo.business.responses.productCategoryResponses.GetAllProductCategoryResponse;

public interface ProductCategoryService {
	
	List<GetAllProductCategoryResponse> getAll();
	
	void add(AddProductCategoryRequest addProductCategoryRequest);
	void update(UpdateProductCategoryRequest updateProductCategoryRequest);
	void delete(int id);

}
