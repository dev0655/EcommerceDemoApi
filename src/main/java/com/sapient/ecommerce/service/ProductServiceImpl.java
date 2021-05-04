package com.sapient.ecommerce.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sapient.ecommerce.entity.Product;
import com.sapient.ecommerce.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
private ProductRepository repository;

public ProductServiceImpl(ProductRepository repository) {
	this.repository = repository;
}

@Override
public Iterable<Product> getAllProducts() {
	return repository.findAll();
}

@Override
public Map<String, List<Product>> getProductsGroupByBrand() {
	Iterable<Product> products = repository.findAll();
	Map<String, List<Product>> map = new HashMap<String, List<Product>>();
	for (Product product : products) {
		
		if (map.get(product.getBrand()) == null) {
		map.put(product.getBrand(), new ArrayList<Product>(Arrays.asList(product)));
		}
		else {
			 List<Product> pr = map.get(product.getBrand());
			 pr.add(product);
			map.put(product.getBrand(),pr);
		}
	}
	
	return map;          
}

@Override
public Map<String, List<Product>> getProductsGroupByColor() {
	Iterable<Product> products = repository.findAll();
	Map<String, List<Product>> map = new HashMap<String, List<Product>>();
	for (Product product : products) {
		
		if (map.get(product.getColor()) == null) {
		map.put(product.getColor(), new ArrayList<Product>(Arrays.asList(product)));
		}
		else {
			 List<Product> pr = map.get(product.getColor());
			 pr.add(product);
			map.put(product.getColor(),pr);
		}
	}	
	return map;          
}

@Override
public Map<String, List<Product>> getProductsGroupBySize() {
	Iterable<Product> products = repository.findAll();
	Map<String, List<Product>> map = new HashMap<String, List<Product>>();
	for (Product product : products) {
		
		if (map.get(product.getSize()) == null) {
		map.put(product.getSize(), new ArrayList<Product>(Arrays.asList(product)));
		}
		else {
			 List<Product> pr = map.get(product.getSize());
			 pr.add(product);
			map.put(product.getSize(),pr);
		}
	}	
	return map;          
}

@Override
public Map<String, List<Product>> getProductsGroupByStock() {
	Iterable<Product> products = repository.findAll();
	Map<String, List<Product>> map = new HashMap<String, List<Product>>();
	for (Product product : products) {
		
		if (map.get(product.getStock()) == null) {
		map.put(product.getStock().toString(), new ArrayList<Product>(Arrays.asList(product)));
		}
		else {
			 List<Product> pr = map.get(product.getStock().toString());
			 pr.add(product);
			map.put(product.getStock().toString(),pr);
		}
	}		
	return map;          
}

@Override
public Product save(Product product) {
	return repository.save(product);
}

@Override
public Map<String, List<Product>> getProductsGroupByPrice() {
	Iterable<Product> products = repository.findAll();
	Map<String, List<Product>> map = new HashMap<String, List<Product>>();
	for (Product product : products) {
		
		if (map.get(product.getPrice()) == null) {
		map.put(product.getPrice().toString(), new ArrayList<Product>(Arrays.asList(product)));
		}
		else {
			 List<Product> pr = map.get(product.getPrice().toString());
			 pr.add(product);
			map.put(product.getPrice().toString(),pr);
		}
	}		
	return map;          
}

}
