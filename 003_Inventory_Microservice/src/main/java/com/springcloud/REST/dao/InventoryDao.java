package com.springcloud.REST.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springcloud.REST.entity.InventoryEntity;
import com.springcloud.REST.repository.InventoryRepository;

@Repository("inventoryDao")
public class InventoryDao {
	@Autowired
	private InventoryRepository invRepo;
	
	public List getAllInventory() {
		return invRepo.findAll();
	}

	public List addInventory(InventoryEntity ie) {
		invRepo.save(ie);
		return invRepo.findAll();
	}

}
