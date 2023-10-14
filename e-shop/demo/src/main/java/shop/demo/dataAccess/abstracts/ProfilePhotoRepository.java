package shop.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.demo.entities.concretes.photos.ProfilePhoto;

public interface ProfilePhotoRepository extends JpaRepository<ProfilePhoto, Integer> {

}
