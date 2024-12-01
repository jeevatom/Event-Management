package com.project.EventManagementsystem.service.admin;

import com.project.EventManagementsystem.entity.common.district;
import com.project.EventManagementsystem.entity.common.state;
import com.project.EventManagementsystem.repository.admin.AdminRepository;
import com.project.EventManagementsystem.repository.admin.DistrictRepo;
import com.project.EventManagementsystem.repository.admin.StateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository repo;

    @Autowired
    StateRepo stateRepo;

    @Autowired
    DistrictRepo districtRepo;
    public List getAdminDetailsService() {
      return repo.findAll();
    }

    public List<state> getStateService() {
        return stateRepo.findAll();
    }

    public List<district> getDistrictService(int id) {
        return districtRepo.findByStateId(id);
    }
}
