package com.cts.EmployeeProfileManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cts.EmployeeProfileManagementSystem.dao.EmployeeProfileRepository;
import com.cts.EmployeeProfileManagementSystem.entity.EmployeeProfile;


@Service
public class EmployeeProfileServiceImpl implements EmployeeProfileService {
	
	@Autowired
	EmployeeProfileRepository empProfileRepository; 

	@Override
	public EmployeeProfile retrieveEmpProfile(int id) {
		return empProfileRepository.findById(id).get(); 
	}

	@Override
	public void createEmpProfile(EmployeeProfile empProfile) {
		
		 empProfileRepository.save(empProfile);
	}

	@Override
	public void deleteEmpProfile(int id) {
		empProfileRepository.deleteById(id);
	}

	@Override
	public List<EmployeeProfile> retrieveAllEmpProfiles() {
		return empProfileRepository.findAll();
	}

}
