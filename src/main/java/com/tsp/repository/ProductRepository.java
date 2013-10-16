package com.tsp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tsp.model.Product;

/**
 * @author smondi
 *
 */
public interface ProductRepository extends MongoRepository<Product, String> {

	List<Product> findByName(String name);
	List<Product> findByType(String type);


}
