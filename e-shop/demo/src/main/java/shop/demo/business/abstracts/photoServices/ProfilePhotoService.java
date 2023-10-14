package shop.demo.business.abstracts.photoServices;

import shop.demo.business.requests.photoRequests.profilePhotoRequests.AddProfilePhotoRequest;

public interface ProfilePhotoService {

	void add(AddProfilePhotoRequest addProfilePhotoRequest);
	
}
