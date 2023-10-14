package shop.demo.business.requests.customerRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomerRequest {
	
	private String firstName;
	private String lastName;
	private String accountEmail;
	private String accountPhoneNumber;
	private String accountUsername;
	private String accountPassword;
	private String accountConfirmPassword;

}
