package com.project.EventManagementsystem.repository.admin;

import com.project.EventManagementsystem.entity.common.state;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface StateRepo extends JpaRepository<state,Integer> {
}
