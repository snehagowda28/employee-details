package com.cognizant.employee.controller;

import com.cognizant.employee.model.EmployeeDetail;
import com.cognizant.employee.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping("/empId")
    public EmployeeDetail getProfileById(@RequestParam Long empId) {
        return profileService.getProfileById(empId);
    }

    @GetMapping("/employees")
    public List<EmployeeDetail> getAllProfiles() {
        return profileService.getAllProfiles();
    }

    @DeleteMapping("/delete/empId")
    public void deleteProfileById(@RequestParam Long empId) {
        profileService.deleteProfileById(empId);
    }
}
