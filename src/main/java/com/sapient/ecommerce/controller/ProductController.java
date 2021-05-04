package com.sapient.ecommerce.controller;

import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.ecommerce.entity.Product;
import com.sapient.ecommerce.service.ProductService;

@RestController
@RequestMapping("/v1/products")
public class ProductController {
	
	private ProductService service;

	public ProductController(ProductService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/getAll")
	public Iterable<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	
	@GetMapping("/get/{groupBy}")
	public Map<String, List<Product>> getProducts(@PathParam("groupBy") String groupBy){
		if(groupBy.trim().equals("BRAND")) {
			return service.getProductsGroupByBrand();
		}
		else if(groupBy.equals("COLOR")) {
			return service.getProductsGroupByColor();
		}
		else if(groupBy.equals("PRICE")) {
			return service.getProductsGroupByPrice();
		}else if(groupBy.equals("SIZE")) {
			return service.getProductsGroupBySize();
		}
		else if(groupBy.equals("STOCK")) {
			return service.getProductsGroupByStock();
		}
		return null;
	}

}
