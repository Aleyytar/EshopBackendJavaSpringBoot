package shop.demo.business.concretes.photoManagers;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import shop.demo.business.abstracts.photoServices.ProductPhotoService;
import shop.demo.business.requests.photoRequests.productPhotoRequests.AddProductPhotoRequest;
import shop.demo.business.responses.photosResponses.productPhotoResponses.GetAllProductPhotosByProductResponse;
import shop.demo.core.cloudinary.CloudinaryService;
import shop.demo.core.utilities.mappers.ModelMapperService;
import shop.demo.dataAccess.abstracts.ProductPhotoRepository;
import shop.demo.entities.concretes.photos.ProductPhoto;

@Service
@AllArgsConstructor
public class ProductPhotoManager implements ProductPhotoService {

	private ProductPhotoRepository productPhotoRepository;
	private ModelMapperService modelMapperService;
	private CloudinaryService cloudinaryService;
	
	@Override
	public List<GetAllProductPhotosByProductResponse> getProductPhotosByProductId(int id) {

		List<GetAllProductPhotosByProductResponse> productPhotoResponse = productPhotoRepository.getProductPhotosByProductId(id)
				.stream().map(productPhoto -> modelMapperService.forResponse().map(productPhoto, GetAllProductPhotosByProductResponse.class))
				.collect(Collectors.toList());

		return productPhotoResponse;
	}
	
	
	@Override
	public void add(AddProductPhotoRequest addProductPhotoRequest) {
		
		ProductPhoto productPhoto = modelMapperService.forRequest().map(addProductPhotoRequest, ProductPhoto.class);
		productPhoto.setId(0);
		
		try {
			
			String url = cloudinaryService.uploadFile(addProductPhotoRequest.getUrl());
			
			productPhoto.setUrl(url);
			
			productPhotoRepository.save(productPhoto);
			
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	
	

}
