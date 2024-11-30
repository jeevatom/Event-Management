package com.project.EventManagementsystem.repository.admin;


import com.project.EventManagementsystem.entity.admin.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity,Long> {

}
