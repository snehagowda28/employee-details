package com.cognizant.employee.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class Project {
    private int projectId;
    private String projectName;
    private List<String> empIdList;
}
