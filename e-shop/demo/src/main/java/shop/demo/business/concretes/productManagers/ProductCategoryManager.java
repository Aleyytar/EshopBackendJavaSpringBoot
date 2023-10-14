package shop.demo.business.concretes.productManagers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import shop.demo.business.abstracts.productServices.ProductCategoryService;
import shop.demo.business.requests.productCategoryRequests.AddProductCategoryRequest;
import shop.demo.business.requests.productCategoryRequests.UpdateProductCategoryRequest;
import shop.demo.business.responses.productCategoryResponses.GetAllProductCategoryResponse;
import shop.demo.core.utilities.mappers.ModelMapperService;
import shop.demo.dataAccess.abstracts.ProductCategoryRepository;
import shop.demo.entities.concretes.ProductCategory;

@Service
@AllArgsConstructor
public class ProductCategoryManager implements ProductCategoryService {

	private ProductCategoryRepository productCategoryRepository;
	private ModelMapperService modelMapperService;
	
	@Override
	public List<GetAllProductCategoryResponse> getAll() {
		
		List<GetAllProductCategoryResponse> productCategoryResponseList = productCategoryRepository.findAll().stream()
				.map(productCategory -> modelMapperService.forResponse().map(productCategory, GetAllProductCategoryResponse.class))
				.collect(Collectors.toList());
		
		return productCategoryResponseList;
	}

	@Override
	public void add(AddProductCategoryRequest addProductCategoryRequest) {
		
		ProductCategory productCategory = modelMapperService.forRequest().map(addProductCategoryRequest, ProductCategory.class);
		productCategory.setId(0);
		
		productCategoryRepository.save(productCategory);

	}

	@Override
	public void update(UpdateProductCategoryRequest updateProductCategoryRequest) {
		
		ProductCategory target = productCategoryRepository.findById(updateProductCategoryRequest.getId()).orElse(null);
		
		if(target != null) {
			
			target = modelMapperService.forRequest().map(updateProductCategoryRequest, ProductCategory.class);
			
			productCategoryRepository.save(target);
			
		}
		

	}

	@Override
	public void delete(int id) {
		
		productCategoryRepository.deleteById(id);

	}

}
