package com.cognizant.employee.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Asset {
    private int asset_id;
    private String assetName;
    private String assetType;
    private String assetStatus;
    private int emp_id;
}
