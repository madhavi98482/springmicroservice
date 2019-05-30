package com.springcloud.REST.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcloud.REST.entity.InventoryEntity;

public interface InventoryRepository extends JpaRepository<InventoryEntity, Long>{

}
