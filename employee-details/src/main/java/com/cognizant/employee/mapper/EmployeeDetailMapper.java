package com.cognizant.employee.mapper;

import com.cognizant.employee.model.Asset;
import com.cognizant.employee.model.Employee;
import com.cognizant.employee.model.EmployeeDetail;
import com.cognizant.employee.model.Project;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDetailMapper {

    public EmployeeDetail toDto(Employee employee, Asset[] assets, Project project) {
        return EmployeeDetail
                .builder()
                .employee(employee)
                .assets(assets)
                .project(project)
                .build();
    }

    public List<EmployeeDetail> toDto(Employee[] employees, Asset[] assets, Project[] projects) {
        List<EmployeeDetail> employeeDetails = new ArrayList<>();

        for (Employee e : employees) {
            employeeDetails.add(toDto(e, getAssets(e.getEmpId(), assets), getProject(e.getProjId(), projects)));
        }
        return employeeDetails;
    }

    public Asset[] getAssets(Integer empId, Asset[] assets) {
        Asset[] empAssets = new Asset[assets.length];
        for (int i = 0; i < assets.length; i++) {
            if (empId == assets[i].getEmp_id()) {
                empAssets[i] = assets[i];
            }
        }
        return empAssets;
    }

    public Project getProject(Integer projectId, Project[] projects) {
        for (int i = 0; i < projects.length; i++) {
            if (projectId == projects[i].getProjectId()) {
                return projects[i];
            }
        }
        return null;
    }
}
