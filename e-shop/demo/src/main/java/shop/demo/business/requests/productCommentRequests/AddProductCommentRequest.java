package shop.demo.business.requests.productCommentRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddProductCommentRequest {
	
	private int productId;
	private int accountId;
	private String text;

}
