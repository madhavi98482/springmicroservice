package com.springboot.REST.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.REST.Entity.ActivityEntity;

public interface ActivityRepository extends JpaRepository<ActivityEntity, Integer> {

}
