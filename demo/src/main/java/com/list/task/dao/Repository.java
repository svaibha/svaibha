package com.list.task.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.list.task.entity.Tasks;

public interface Repository extends JpaRepository<Tasks, Integer>{

}
