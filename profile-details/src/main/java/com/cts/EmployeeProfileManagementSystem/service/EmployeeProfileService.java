package com.cts.EmployeeProfileManagementSystem.service;

import java.util.List;

import com.cts.EmployeeProfileManagementSystem.entity.EmployeeProfile;

public interface EmployeeProfileService {

	public EmployeeProfile retrieveEmpProfile(int id); 
	public void createEmpProfile(EmployeeProfile empProfile); 
	public void deleteEmpProfile(int id);
	public List<EmployeeProfile> retrieveAllEmpProfiles();
}
