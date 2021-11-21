package com.cognizant.employee.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class Employee {
    private int empId;
    private String empName;
    private String empPhone;
    private int empExperience;
    private List<String> empTechStack;
    private int projId;
}
