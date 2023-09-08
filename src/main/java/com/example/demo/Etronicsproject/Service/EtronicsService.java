package com.example.demo.Etronicsproject.Service;

import com.example.demo.Etronicsproject.Entity1.Products;

public interface EtronicsService {
	
	Products login(String p_name);

	Products addProduct(Products product);

	Products updatedb(String p_name, Products product);

	
	void Delete(String p_name);

}
