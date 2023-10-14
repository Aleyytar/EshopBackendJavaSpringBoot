package shop.demo.business.requests.productCategoryRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductCategoryRequest {
	
	private int id;
	private String name;

}
