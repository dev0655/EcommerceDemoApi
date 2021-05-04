package com.sapient.ecommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sapient.ecommerce.entity.Product;
import com.sapient.ecommerce.entity.Seller;
import com.sapient.ecommerce.service.ProductService;

@SpringBootApplication
public class EcommerceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProductService service) {
return args -> {
	Product p = new Product(1L, "CheckShirt", 100.0, "BLACK", "SHIRT", "M", 10, "LEVIS");
	p.setSeller(new Seller(1L, "BigMart"));
	Product p1 =new Product(2L, "Jeans", 200.0, "BLUE", "PANT", "32", 10, "LEVIS");
	p1.setSeller(new Seller(2L, "MART"));
	Product p2= new Product(3L, "Socks", 50.0, "BLACK", "SOCK", "M", 10, "REEBOK");
	p2.setSeller(new Seller(3L, "SMART"));
	Product p3= new Product(4L, "Television", 10000.0, "BLACK", "TV", "22", 10, "SAMSUNG");
	p3.setSeller(new Seller(4L, "samsung"));
	service.save(p);
	service.save(p1);
	service.save(p2);
	service.save(p3);
};
	}
}
