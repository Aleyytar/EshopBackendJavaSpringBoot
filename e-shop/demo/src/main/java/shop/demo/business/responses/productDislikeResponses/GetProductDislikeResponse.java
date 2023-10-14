package shop.demo.business.responses.productDislikeResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetProductDislikeResponse {
	
	private int id;
	private String username;
	private String accountUrl;

}
