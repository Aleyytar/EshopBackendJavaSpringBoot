package shop.demo.business.abstracts.productServices;

import java.util.List;

import shop.demo.business.requests.productCommentRequests.AddProductCommentRequest;
import shop.demo.business.requests.productCommentRequests.UpdateProductCommentRequest;
import shop.demo.business.responses.productCommentResponses.GetProductCommentResponse;

public interface ProductCommentService {
	
	List<GetProductCommentResponse> getProductCommentsByProductId(int id);
	void add(AddProductCommentRequest addProductCommentRequest);
	void update(UpdateProductCommentRequest updateProductCommentRequest);
	void delete(int id);
	

}
