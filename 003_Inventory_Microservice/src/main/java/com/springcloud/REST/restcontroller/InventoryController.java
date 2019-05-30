package com.springcloud.REST.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.REST.entity.InventoryEntity;
import com.springcloud.REST.service.InventoryService;

@RestController
public class InventoryController {
	@Autowired
	private InventoryService inventoryService;
	
	@RequestMapping("/")
	
	public String welcome() {
		return "welcome";
	}
	@RequestMapping("/all")
	public List getAllInventory() {
		return inventoryService.getAllInventory();
	}
	
	@RequestMapping("/add")
	  public List addInventory(@RequestBody InventoryEntity ie) { 
		  return inventoryService.addInventory(ie);
		  }
	 

}
