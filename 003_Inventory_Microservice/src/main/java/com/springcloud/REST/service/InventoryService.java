package com.springcloud.REST.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.REST.dao.InventoryDao;
import com.springcloud.REST.entity.InventoryEntity;
@Service("inventoryService")
public class InventoryService {
	@Autowired
	private InventoryDao inventoryDao;
	
	public List getAllInventory() {
		return inventoryDao.getAllInventory();
	}

	public List addInventory(InventoryEntity ie) {
		// TODO Auto-generated method stub
		return inventoryDao.addInventory(ie);
	}

}
