package shop.demo.business.requests.productCommentRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductCommentRequest {
	
	private int id;
	private int accountId;
	private int productId;
	private String text;

}
