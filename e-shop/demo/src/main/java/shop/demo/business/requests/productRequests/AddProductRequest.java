package shop.demo.business.requests.productRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddProductRequest {
	
	private int companyId;
	private int productCategoryId;
	private String name;
	private String description;
	private double minPrice;
	private double maxPrice;

}
