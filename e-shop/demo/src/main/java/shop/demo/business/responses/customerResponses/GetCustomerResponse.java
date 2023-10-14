package shop.demo.business.responses.customerResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCustomerResponse {
	
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String phoneNumber;
	private String url;

}
