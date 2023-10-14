package shop.demo.business.abstracts.accountServices;

import java.util.List;

import shop.demo.business.requests.customerRequests.AddCustomerRequest;
import shop.demo.business.requests.customerRequests.UpdateCustomerRequest;
import shop.demo.business.responses.customerResponses.GetAllCustomerResponse;
import shop.demo.business.responses.customerResponses.GetCustomerResponse;

public interface CustomerService {

	List<GetAllCustomerResponse> getAll();
	GetCustomerResponse getCustomerById(int id);
	void add(AddCustomerRequest addCustomerRequest);
	void update(UpdateCustomerRequest updateCustomerRequest);
	void delete(int id);
	
	
}
