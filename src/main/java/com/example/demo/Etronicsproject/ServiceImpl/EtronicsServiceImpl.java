package com.example.demo.Etronicsproject.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Etronicsproject.Entity1.Products;
import com.example.demo.Etronicsproject.Exception.ResourceNotFoundException;
import com.example.demo.Etronicsproject.Repository.EtronicsRepo;
import com.example.demo.Etronicsproject.Service.EtronicsService;
import org.springframework.stereotype.Service;
@Service
public class EtronicsServiceImpl implements EtronicsService {
    @Autowired
    EtronicsRepo etronicsrepo;
	@Override
	public Products login(String p_name) {
		// TODO Auto-generated method stub
		Products p1 = etronicsrepo.findByName(p_name);
		if(p1!=null) {
			if(p1.getP_name().equals(p_name)) {
				return p1;
			}else {
				throw new ResourceNotFoundException();
			
			
			}
		}else {
			throw new ResourceNotFoundException();
		}
		
	}

	@Override
	public Products addProduct(Products product) {
		// TODO Auto-generated method stub
		return etronicsrepo.save(product);
	}

	@Override
	public Products updatedb(String p_name, Products product) {
		// TODO Auto-generated method stub
		Products p2= etronicsrepo.findByName(p_name);
		if(p2!=null) {
			p2.setP_name(p2.getP_name());
			p2.setDescription(p2.getDescription());
			p2.setImageurl(p2.getImageurl());
		return etronicsrepo.save(p2);
		}
		else {
			throw new ResourceNotFoundException();
		}
	}

	@Override
	public void Delete(String p_name) {
		// TODO Auto-generated method stub
		Products p3= etronicsrepo.findByName(p_name);
		if(p3!=null) {
			etronicsrepo.delete(p3);
		}
		else {
			throw new ResourceNotFoundException();
		}
		
	}
	

}
