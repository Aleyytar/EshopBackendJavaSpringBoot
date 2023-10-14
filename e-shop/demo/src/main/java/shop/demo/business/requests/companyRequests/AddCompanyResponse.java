package shop.demo.business.requests.companyRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCompanyResponse {
	
	private String companyName;
	private String accountEmail;
	private String accountPhoneNumber;
	private String accountUsername;
	private String accountPassword;
	private String accountConfirmPassword;

}
