package com.spring.S501.repository;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.S501.model.WhiteCollarShop;

@Repository
//public interface WhiteCollarShopRepository extends JpaRepository<WhiteCollarShop, Long> {
public interface WhiteCollarShopRepository extends CrudRepository<WhiteCollarShop, Long> {

}
