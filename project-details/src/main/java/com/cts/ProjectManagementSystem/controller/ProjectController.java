package com.cts.ProjectManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ProjectManagementSystem.dao.ProjectRepository;
import com.cts.ProjectManagementSystem.entity.Project;

@RestController
public class ProjectController {
	
	@Autowired
	ProjectRepository projRepo;
	
	@GetMapping(value="/projects")
	public List<Project> getProjects()
	{
		return projRepo.findAll();
	}
	
	@GetMapping(value="/projects/{projId}")
	public Project getProjectDetails(@PathVariable("projId") int id)
	{
		return projRepo.findById(id).get();
	}

}
