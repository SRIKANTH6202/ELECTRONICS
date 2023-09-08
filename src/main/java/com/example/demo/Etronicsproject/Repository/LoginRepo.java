package com.example.demo.Etronicsproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.Etronicsproject.Entity.Loginform;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface LoginRepo extends JpaRepository<Loginform, Integer> {
	
	@Query(value= "select * from Loginform where email=?", nativeQuery = true)
    Loginform findByEmail(String email);
}
