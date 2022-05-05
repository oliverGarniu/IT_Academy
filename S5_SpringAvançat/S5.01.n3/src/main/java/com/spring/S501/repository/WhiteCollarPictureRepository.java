package com.spring.S501.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.S501.model.WhiteCollarPicture;

@Repository
//public interface WhiteCollarPictureRepository extends JpaRepository<WhiteCollarPicture, Long> {
public interface WhiteCollarPictureRepository extends CrudRepository<WhiteCollarPicture, Long> {

}
