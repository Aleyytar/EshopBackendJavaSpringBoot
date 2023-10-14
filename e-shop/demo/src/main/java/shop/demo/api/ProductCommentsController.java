package shop.demo.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import shop.demo.business.abstracts.productServices.ProductCommentService;
import shop.demo.business.requests.productCommentRequests.AddProductCommentRequest;
import shop.demo.business.requests.productCommentRequests.UpdateProductCommentRequest;
import shop.demo.business.responses.productCommentResponses.GetProductCommentResponse;

@RestController
@RequestMapping("/api/productcomments")
@AllArgsConstructor
public class ProductCommentsController {
	
	private ProductCommentService productCommentService;
	
	@GetMapping("/getproductcommentsbyproductid/{id}")
	public List<GetProductCommentResponse> getProductCommentsByProductId(@PathVariable int id){
		
		return productCommentService.getProductCommentsByProductId(id);
		
	}
	
	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody AddProductCommentRequest addProductCommentRequest) {
		
		productCommentService.add(addProductCommentRequest);
		
	}
	
	@PutMapping("/update")
	public void update(@RequestBody UpdateProductCommentRequest updateProductCommentRequest) {
		
		productCommentService.update(updateProductCommentRequest);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		
		productCommentService.delete(id);
	}

}
