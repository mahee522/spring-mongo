package com.tsp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tsp.model.Inventory;


public interface InventoryRepository extends MongoRepository<Inventory, String> {

}
