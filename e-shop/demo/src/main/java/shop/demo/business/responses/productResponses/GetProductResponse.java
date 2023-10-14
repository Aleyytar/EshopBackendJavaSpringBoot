package shop.demo.business.responses.productResponses;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shop.demo.business.responses.photosResponses.productPhotoResponses.GetAllProductPhotosByProductResponse;
import shop.demo.business.responses.productCommentResponses.GetProductCommentResponse;
import shop.demo.business.responses.productDislikeResponses.GetProductDislikeResponse;
import shop.demo.business.responses.productLikeResponses.GetProductLikeRespone;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetProductResponse {
	
	private int id;
	private String name;
	private String username;
	private String categoryName;
	private String description;
	private double minPrice;
	private double maxPrice;
	private List<GetAllProductPhotosByProductResponse> productPhotos;
	private List<GetProductCommentResponse> comments;
	private List<GetProductLikeRespone> productLikes;
	private List<GetProductDislikeResponse> productDislikes;
}
