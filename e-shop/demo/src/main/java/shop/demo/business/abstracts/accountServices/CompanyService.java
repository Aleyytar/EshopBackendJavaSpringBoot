package shop.demo.business.abstracts.accountServices;

import java.util.List;

import shop.demo.business.requests.companyRequests.AddCompanyResponse;
import shop.demo.business.requests.companyRequests.UpdateCompanyRequest;
import shop.demo.business.responses.companyResponses.GetAllCompanyResponse;
import shop.demo.business.responses.companyResponses.GetCompanyResponse;

public interface CompanyService {
	
	List<GetAllCompanyResponse> getAll();
	GetCompanyResponse getCompanyById(int id);
	void add(AddCompanyResponse companyResponse);
	void update(UpdateCompanyRequest updateCompanyRequest);
	void delete(int id);
	

}
