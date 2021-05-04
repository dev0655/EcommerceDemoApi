package com.sapient.ecommerce.service;

import java.util.List;
import java.util.Map;

import com.sapient.ecommerce.entity.Product;

public interface ProductService {

	public Iterable<Product> getAllProducts();
	public Product save(Product product);
	public Map<String,List<Product>> getProductsGroupByBrand();
	public  Map<String,List<Product>> getProductsGroupByColor();
	public  Map<String,List<Product>> getProductsGroupBySize();
	public  Map<String,List<Product>> getProductsGroupByStock();
	public  Map<String,List<Product>> getProductsGroupByPrice();
} 
