package com.project.EventManagementsystem.controller.admin;

import com.project.EventManagementsystem.DTOs.eventDto;
import com.project.EventManagementsystem.entity.common.district;
import com.project.EventManagementsystem.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  com.project.EventManagementsystem.entity.common.state;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService service;

    // localhost:8080/admin/allAdminDetails
    @GetMapping("/allAdminDetails")
    public List getAdminDetails(){
        return service.getAdminDetailsService();
    }

    @GetMapping("/states")
    public List<state> getState(){
     return service.getStateService();
    }

    @GetMapping("/districts/{id}")
    public List<district> getDistrict(@PathVariable int id){
        return service.getDistrictService(id);
    }

}
