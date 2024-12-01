package com.project.EventManagementsystem.controller.admin;

import com.project.EventManagementsystem.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
