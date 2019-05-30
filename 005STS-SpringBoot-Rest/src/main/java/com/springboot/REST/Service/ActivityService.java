package com.springboot.REST.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.REST.Dao.ActivityDAO;
import com.springboot.REST.Entity.ActivityEntity;
import com.springboot.REST.pojo.Activity;

@Service
public class ActivityService {

	@Autowired
	private ActivityDAO ActivityDao;
	public void saveactivity(Activity activity) {
		ActivityDao.saveactivity(activity);
}
	public List<ActivityEntity> getAllActivities() {
		return ActivityDao.getAllActivities();
	}
	public List<ActivityEntity> updateActivityById(int id,Activity activity) {
		return ActivityDao.updateActivityById(id,activity);
	}
}
