package shop.demo.business.responses.companyResponses;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shop.demo.business.responses.productResponses.GetAllProductResponse;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCompanyResponse {
	
	private int id;
	private String companyName;
	private String description;
	private String email;
	private String username;
	private String phoneNumber;
	private String url;
	private List<GetAllProductResponse> products;

}
