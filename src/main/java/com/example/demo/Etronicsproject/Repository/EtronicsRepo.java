package com.example.demo.Etronicsproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Etronicsproject.Entity1.Products;

@Repository
public interface EtronicsRepo extends JpaRepository<Products, String> {

		@Query(value =  "select * from Products where p_name =?" , nativeQuery = true)
		Products findByName(String p_name);


}
	
