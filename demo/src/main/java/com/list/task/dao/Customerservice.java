package com.list.task.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.list.task.entity.Tasks;

@Service
public class Customerservice {
	List<Tasks>list;
	
	@Autowired
	 Repository trepository;
	
	public List<Tasks>getalltasks(){
		return list;
	}
	
	public Tasks addTask(@RequestBody Tasks task) {
		return trepository.save(task);
	}

}
