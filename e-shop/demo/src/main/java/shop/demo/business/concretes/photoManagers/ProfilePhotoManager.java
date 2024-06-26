package shop.demo.business.concretes.photoManagers;

import java.io.IOException;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import shop.demo.business.abstracts.photoServices.ProfilePhotoService;
import shop.demo.business.requests.photoRequests.profilePhotoRequests.AddProfilePhotoRequest;
import shop.demo.core.cloudinary.CloudinaryService;
import shop.demo.core.utilities.mappers.ModelMapperService;
import shop.demo.dataAccess.abstracts.ProfilePhotoRepository;
import shop.demo.entities.concretes.photos.ProfilePhoto;

@Service
@AllArgsConstructor
public class ProfilePhotoManager implements ProfilePhotoService {
	
	private ProfilePhotoRepository profilePhotoRepository;
	private CloudinaryService cloudinaryService;
	private ModelMapperService modelMapperService;

	@Override
	public void add(AddProfilePhotoRequest addProfilePhotoRequest) {
		
		ProfilePhoto profilePhoto = modelMapperService.forRequest().map(addProfilePhotoRequest, ProfilePhoto.class);
		profilePhoto.setId(0);
		
		try {
			String url = cloudinaryService.uploadFile(addProfilePhotoRequest.getUrl());
			
			profilePhoto.setUrl(url);
			
			profilePhotoRepository.save(profilePhoto);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
