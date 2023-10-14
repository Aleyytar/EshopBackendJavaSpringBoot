package shop.demo.business.responses.productCommentResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetProductCommentResponse {
	
	private int id;
	private String text;
	private String username;
	private String accountUrl;

}
