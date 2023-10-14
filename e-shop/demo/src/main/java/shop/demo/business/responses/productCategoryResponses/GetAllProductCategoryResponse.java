package shop.demo.business.responses.productCategoryResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProductCategoryResponse {
	
	private int id;
	private String name;

}
