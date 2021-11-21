package com.cognizant.employee.service;

import com.cognizant.employee.mapper.EmployeeDetailMapper;
import com.cognizant.employee.model.Asset;
import com.cognizant.employee.model.Employee;
import com.cognizant.employee.model.EmployeeDetail;
import com.cognizant.employee.model.Project;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfileService {

    private final RestTemplate restTemplate;
    private final EmployeeDetailMapper employeeDetailMapper;

    public List<EmployeeDetail> getAllProfiles() {
        Asset[] assets = restTemplate.getForObject(
                "http://localhost:8082/assetManagement/assets", Asset[].class);
        Employee[] employees = restTemplate.getForObject(
                "http://localhost:8088/EmpProfiles", Employee[].class);
        Project[] projects = restTemplate.getForObject(
                "http://localhost:8181/projects", Project[].class);
        return employeeDetailMapper.toDto(employees, assets, projects);
    }

    public EmployeeDetail getProfileById(Long empId) {
        Asset[] assets = restTemplate.getForObject("http://localhost:8082/assetManagement/assets/empId/" + empId, Asset[].class);
        Employee employee = restTemplate.getForObject("http://localhost:8088/EmpProfiles/" + empId, Employee.class);
        Project project = null;
        if (null != employee) {
            project = restTemplate.getForObject("http://localhost:8181/projects/" + employee.getProjId(), Project.class);
        }
        return employeeDetailMapper.toDto(employee, assets, project);
    }

    public void deleteProfileById(Long empId) {
        restTemplate.delete("http://localhost:8088/EmpProfiles/" + empId);
    }
}
