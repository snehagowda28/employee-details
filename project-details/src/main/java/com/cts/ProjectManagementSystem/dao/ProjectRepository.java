package com.cts.ProjectManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.ProjectManagementSystem.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer>{
	

}
