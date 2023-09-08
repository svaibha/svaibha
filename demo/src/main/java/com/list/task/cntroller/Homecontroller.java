package com.list.task.cntroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.list.task.dao.Customerservice;
import com.list.task.dao.Repository;
import com.list.task.entity.Tasks;


@RestController
@RequestMapping("/tasks")
public class Homecontroller {
	
	@Autowired
	 Repository trepository;
	
	@GetMapping()
	public List<Tasks>getalltasks(){
		return trepository.findAll();
	}
	@PostMapping()
	public Tasks addTask(@Validated @RequestBody Tasks task) {
		return trepository.save(task);
	}
	
	 @DeleteMapping("/{tid}")
	  public void deleteEmployee(@PathVariable Integer tid) {
		 trepository.deleteById(tid);
	  }
	 @PutMapping("/{tid}")
	 public Tasks updateTask(@RequestBody Tasks tasks,@PathVariable Integer tid) {
		 tasks.setTId(tid);
		 return trepository.save(tasks);
	 }
}
