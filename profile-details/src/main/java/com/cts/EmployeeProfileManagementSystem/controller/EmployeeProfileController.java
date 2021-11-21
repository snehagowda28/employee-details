package com.cts.EmployeeProfileManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.EmployeeProfileManagementSystem.dao.EmployeeProfileRepository;
import com.cts.EmployeeProfileManagementSystem.entity.EmployeeProfile;
import com.cts.EmployeeProfileManagementSystem.service.EmployeeProfileService;

@RestController
public class EmployeeProfileController {

	@Autowired
    EmployeeProfileService empProfileService;

	@GetMapping(value = "/EmpProfiles/{id}")
	public ResponseEntity<EmployeeProfile> getEmpProfile(@PathVariable("id") int id) {
		return new ResponseEntity<>(empProfileService.retrieveEmpProfile(id), HttpStatus.OK);
	}
	
	@GetMapping(value = "/EmpProfiles")
	public ResponseEntity<?> getAllEmpProfiles() {
		return new ResponseEntity<>(empProfileService.retrieveAllEmpProfiles(), HttpStatus.OK);
	}

	@PostMapping(value = "/EmpProfiles")
	public ResponseEntity<Object> postEmpProfile(@RequestBody EmployeeProfile empProfile) {
		empProfileService.createEmpProfile(empProfile);
		return new ResponseEntity<>("Employee Profile is created successsfully", HttpStatus.OK);
	}

	@DeleteMapping(value = "/EmpProfiles/{id}")
	public ResponseEntity<Object> deleteEmployeeProfile(@PathVariable("id") int id) {
		empProfileService. deleteEmpProfile(id);
		return new ResponseEntity<>("Employee Profile is deleted successsfully", HttpStatus.OK);
	}

}
