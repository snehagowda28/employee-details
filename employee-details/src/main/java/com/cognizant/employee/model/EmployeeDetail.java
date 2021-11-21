package com.cognizant.employee.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Builder
public class EmployeeDetail {
    private Employee employee;
    private Asset[] assets;
    private Project project;
}
