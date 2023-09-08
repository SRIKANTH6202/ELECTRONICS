package com.example.demo.Etronicsproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Etronicsproject.Entity1.Products;
import com.example.demo.Etronicsproject.Service.EtronicsService;
@RestController
public class EtronicsController {
	
	
	@Autowired
	EtronicsService etronicsService;
	
	@GetMapping("/login")
	public Products login(@RequestHeader String p_name) {
		
		return etronicsService.login(p_name); 
	}
	
	@PostMapping("/post")
	public Products addProducts(@RequestBody Products product) {
		
		return etronicsService.addProduct(product);
	}
	
	@PutMapping("/update")
	public Products update(@RequestHeader String p_name , @RequestBody Products product ) {
		
		return etronicsService.updatedb(p_name,product);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String p_name) {
		etronicsService.Delete(p_name);
		return "data deleted";
	}

}
