package com.sapient.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.sapient.ecommerce.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
