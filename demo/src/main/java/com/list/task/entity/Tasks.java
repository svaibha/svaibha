package com.list.task.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="tasks")
public class Tasks {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer TId;
	private String Title;
	private String description;
	private String status;
	public Integer getTId() {
		return TId;
	}
	public void setTId(Integer tId) {
		TId = tId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Tasks(Integer tId, String title, String description, String status) {
		super();
		TId = tId;
		Title = title;
		this.description = description;
		this.status = status;
	}
	@Override
	public String toString() {
		return "entity [TId=" + TId + ", Title=" + Title + ", description=" + description + ", status=" + status + "]";
	}
	public Tasks() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
