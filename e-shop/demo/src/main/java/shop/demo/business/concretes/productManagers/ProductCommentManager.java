package shop.demo.business.concretes.productManagers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import shop.demo.business.abstracts.productServices.ProductCommentService;
import shop.demo.business.requests.productCommentRequests.AddProductCommentRequest;
import shop.demo.business.requests.productCommentRequests.UpdateProductCommentRequest;
import shop.demo.business.responses.productCommentResponses.GetProductCommentResponse;
import shop.demo.core.utilities.mappers.ModelMapperService;
import shop.demo.dataAccess.abstracts.ProductCommentRepository;
import shop.demo.entities.concretes.ProductComment;

@Service
@AllArgsConstructor
public class ProductCommentManager implements ProductCommentService {

	private ProductCommentRepository productCommentRepository;
	private ModelMapperService modelMapperService;
	
	@Override
	public List<GetProductCommentResponse> getProductCommentsByProductId(int id) {
		
		List<GetProductCommentResponse> productCommentResponseList = productCommentRepository.findAll().stream().map(productComment ->
		modelMapperService.forResponse().map(productComment, GetProductCommentResponse.class)).collect(Collectors.toList());
		
		return productCommentResponseList;
	}

	@Override
	public void add(AddProductCommentRequest addProductCommentRequest) {

		ProductComment productComment = modelMapperService.forRequest().map(addProductCommentRequest, ProductComment.class);
		productComment.setId(0);
		
		productCommentRepository.save(productComment);

	}

	@Override
	public void update(UpdateProductCommentRequest updateProductCommentRequest) {
		
		ProductComment target = productCommentRepository.findById(updateProductCommentRequest.getId()).orElse(null);
		int targetId = target.getId();
		
		if(target != null) {
			
			target = modelMapperService.forRequest().map(updateProductCommentRequest, ProductComment.class);
			target.setId(targetId);
			
			productCommentRepository.save(target);
			
		}
		
		
	}

	@Override
	public void delete(int id) {
		
		productCommentRepository.deleteById(id);
		
	}

}
