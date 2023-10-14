package shop.demo.business.requests.productDislikeRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddProductDislikeRequest {
	
	private int productId;
	private int accountId;

}
