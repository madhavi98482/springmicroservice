package com.springcloud.REST.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.REST.dao.ProductDao;
import com.springcloud.REST.entity.ProductEntity;
@Service("prodService")
public class ProductService {

	@Autowired
	private ProductDao productDao;
	
	public List getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}

	public List addProduct(ProductEntity product) {
		// TODO Auto-generated method stub
		return productDao.addProduct(product);
	}

}
