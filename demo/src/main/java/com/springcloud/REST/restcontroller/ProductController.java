package com.springcloud.REST.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.REST.entity.ProductEntity;
import com.springcloud.REST.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService prodService;
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome";
	}
	
	@RequestMapping("/all")
	public List getAllProducts() {	
		return prodService.getAllProducts();
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)	
	public List addProduct(@RequestBody ProductEntity product) {
		return prodService.addProduct(product);
	}

}
