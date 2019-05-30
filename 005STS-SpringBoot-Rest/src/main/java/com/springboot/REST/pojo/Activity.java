package com.springboot.REST.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Activity {
	private int id;
	private String Todo;
	private boolean done;
	private boolean suspend;
}
