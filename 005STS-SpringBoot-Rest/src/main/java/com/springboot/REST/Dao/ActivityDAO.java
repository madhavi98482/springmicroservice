package com.springboot.REST.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.REST.Entity.ActivityEntity;
import com.springboot.REST.pojo.Activity;
import com.springboot.REST.repository.ActivityRepository;


@Repository
public class ActivityDAO  {
	
		@Autowired
		private ActivityRepository ActivityRepository;

		public void saveactivity(Activity activity) {
		ActivityEntity fe = new ActivityEntity();

		fe.setTodo(activity.getTodo());
		fe.setDone(activity.isDone());
		fe.setSuspend(activity.isSuspend());
		ActivityRepository.save(fe);
	
		}

		public List<ActivityEntity> getAllActivities() {
			return ActivityRepository.findAll();
			}

		public List<ActivityEntity> updateActivityById(int id, Activity activity) {
			
			ActivityEntity fe = new ActivityEntity();
			fe.setId(id);
			System.out.println("id:"+id);
			
			fe.setTodo(activity.getTodo());
			fe.setSuspend(activity.isSuspend());
			fe.setDone(activity.isDone());
			ActivityRepository.saveAndFlush(fe);
			return ActivityRepository.findAll();
		}

	}
