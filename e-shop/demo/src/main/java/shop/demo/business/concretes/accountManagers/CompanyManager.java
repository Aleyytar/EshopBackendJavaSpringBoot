package shop.demo.business.concretes.accountManagers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import shop.demo.business.abstracts.accountServices.CompanyService;
import shop.demo.business.requests.companyRequests.AddCompanyResponse;
import shop.demo.business.requests.companyRequests.UpdateCompanyRequest;
import shop.demo.business.responses.companyResponses.GetAllCompanyResponse;
import shop.demo.business.responses.companyResponses.GetCompanyResponse;
import shop.demo.core.utilities.mappers.ModelMapperService;
import shop.demo.dataAccess.abstracts.CompanyRepository;
import shop.demo.entities.concretes.accounts.Company;

@Service
@AllArgsConstructor
public class CompanyManager implements CompanyService{

	private CompanyRepository companyRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllCompanyResponse> getAll() {
		
		List<GetAllCompanyResponse> companyResponseList = companyRepository.findAll().stream().map(company -> 
		modelMapperService.forResponse().map(company, GetAllCompanyResponse.class)).collect(Collectors.toList());
		
		
		return companyResponseList;
	}
	
	@Override
	public GetCompanyResponse getCompanyById(int id) {
		
		Company target = companyRepository.findById(id).orElse(null);
		
		if(target != null) {
			
			GetCompanyResponse companyResponse = modelMapperService.forResponse().map(target, GetCompanyResponse.class);
			return companyResponse;
			
		}
		
		return null;
	}

	@Override
	public void add(AddCompanyResponse companyResponse) {
		
		Company company = modelMapperService.forRequest().map(companyResponse, Company.class);
		
		
		companyRepository.save(company);
		
	}

	

	@Override
	public void update(UpdateCompanyRequest updateCompanyRequest) {
		
		Company target = companyRepository.findById(updateCompanyRequest.getId()).orElse(null);
		int accountId = target.getAccount().getId();
		
		if(target != null) {
			
			target = modelMapperService.forRequest().map(updateCompanyRequest, Company.class);
			target.getAccount().setId(accountId);
			
			companyRepository.save(target);
			
			
		}
		
		
	}

	@Override
	public void delete(int id) {
		
		companyRepository.deleteById(id);
		
	}
	
}
