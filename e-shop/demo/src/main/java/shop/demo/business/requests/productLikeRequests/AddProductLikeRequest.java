package shop.demo.business.requests.productLikeRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddProductLikeRequest {
	
	private int productId;
	private int accountId;

}
