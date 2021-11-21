package com.cts.EmployeeProfileManagementSystem.entity;

import java.util.List;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profile")
public class EmployeeProfile {

	@Id
	private int empId;
	private String empName;
	private String empPhone;
	private int empExperience;
	@Convert(converter = StringListConverter.class)
	private List<String> empTechStack;
	private int projId;
	
	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}

	public EmployeeProfile() {
		super();
	}

	
	public EmployeeProfile(int empId, String empName, String empPhone, int empExperience, List<String> empTechStack,
			int projId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPhone = empPhone;
		this.empExperience = empExperience;
		this.empTechStack = empTechStack;
		this.projId = projId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public int getempExperience() {
		return empExperience;
	}

	public void setempExperience(int empExperience) {
		this.empExperience = empExperience;
	}

	public List<String> getEmpTechStack() {
		return empTechStack;
	}

	public void setEmpTechStack(List<String> empTechStack) {
		this.empTechStack = empTechStack;
	}

}
