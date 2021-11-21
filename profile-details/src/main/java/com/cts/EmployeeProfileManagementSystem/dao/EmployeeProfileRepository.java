package com.cts.EmployeeProfileManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.EmployeeProfileManagementSystem.entity.EmployeeProfile;

public interface EmployeeProfileRepository extends JpaRepository<EmployeeProfile, Integer> {

}
