package com.springcloud.REST.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springcloud.REST.entity.ProductEntity;
import com.springcloud.REST.repository.ProductRepository;

@Repository("prodDao")
public class ProductDao {

	@Autowired
	private ProductRepository prodRepository;
	
	public List getAllProducts() {
		// TODO Auto-generated method stub
		return prodRepository.findAll();
	}

	public List addProduct(ProductEntity product) {
		// TODO Auto-generated method stub
		 prodRepository.save(product);
		return prodRepository.findAll();
	}
}
