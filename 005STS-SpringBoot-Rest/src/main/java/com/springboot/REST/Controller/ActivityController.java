package com.springboot.REST.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.REST.Entity.ActivityEntity;
import com.springboot.REST.Service.ActivityService;
import com.springboot.REST.pojo.Activity;

@RestController
public class ActivityController {
	
	@Autowired
	private ActivityService activityService; 

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Activity Database!";
	}

	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void saveActivity(@RequestBody Activity activity) {
		System.out.println(activity.toString());
		activityService.saveactivity(activity);
		}
	
	@GetMapping("/all")
	public List<ActivityEntity> getAllActivities() {
		return activityService.getAllActivities();
	}
	
	@PostMapping("update/{myid}")
	public List<ActivityEntity> updateActivityById(@PathVariable("myid") int id,@RequestBody Activity activity) {
		return activityService.updateActivityById(id, activity);
	}
	

	
	
	
}
