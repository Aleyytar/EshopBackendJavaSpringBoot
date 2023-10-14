package shop.demo.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import shop.demo.business.abstracts.productServices.ProductService;
import shop.demo.business.requests.productRequests.AddProductRequest;
import shop.demo.business.responses.productResponses.GetAllProductResponse;
import shop.demo.business.responses.productResponses.GetProductResponse;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductsController {

	private ProductService productService;
	
	@GetMapping("/getall")
	public List<GetAllProductResponse> getAll(){
		
		return productService.getAll();
	}
	
	@GetMapping("/getproductsbyproductcategoryid/{id}")
	public List<GetAllProductResponse> getProductsByProductCategoryId(@PathVariable int id){
		
		
		return productService.getProductsByProductCategoryId(id);
		
	}
	
	@GetMapping("/getproductbyid/{id}")
	public GetProductResponse getProductById(@PathVariable int id) {
		
		return productService.getProductById(id);
		
	}
	
	@PostMapping("/add")
	public void add(@RequestBody AddProductRequest addProductRequest) {
		
		productService.add(addProductRequest);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		
		productService.delete(id);
	}
}
