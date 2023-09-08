package com.example.demo.Etronicsproject.Entity1;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Products{
	
	@Id
	private String p_name;
			private String description;
			private String imageurl;
			public String getP_name() {
				return p_name;
			}
			public void setP_name(String p_name) {
				this.p_name = p_name;
			}
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			public String getImageurl() {
				return imageurl;
			}
			public void setImageurl(String imageurl) {
				this.imageurl = imageurl;
			}

}
