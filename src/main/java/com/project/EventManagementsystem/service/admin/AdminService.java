package com.project.EventManagementsystem.service.admin;

import com.project.EventManagementsystem.repository.admin.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository repo;
    public List getAdminDetailsService() {
      return repo.findAll();
    }
}
