package com.springcloud.REST.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcloud.REST.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{

}
