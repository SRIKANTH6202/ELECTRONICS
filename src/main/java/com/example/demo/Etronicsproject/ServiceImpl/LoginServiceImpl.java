package com.example.demo.Etronicsproject.ServiceImpl;

import com.example.demo.Etronicsproject.Entity.Loginform;
import com.example.demo.Etronicsproject.Exception.ResourceNotFoundException;
import com.example.demo.Etronicsproject.Repository.LoginRepo;
import com.example.demo.Etronicsproject.Service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    LoginRepo loginRepo;
	@Override
	public Loginform login(String email, String password) {
		// TODO Auto-generated method stub
		Loginform l=loginRepo.findByEmail(email);
		
		if(l!=null) {
			if(l.getPassword().equals(password)) {
				return l;
			}else {
				throw new ResourceNotFoundException();
			}
		}else {
			throw new ResourceNotFoundException();
		}
		
	}

}
