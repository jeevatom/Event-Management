package com.project.EventManagementsystem.repository.admin;
import com.project.EventManagementsystem.entity.common.district;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DistrictRepo extends JpaRepository<district,Integer> {

        // Correct query to use the stateId from the associated state entity
        @Query("SELECT d FROM district d WHERE d.stateId.stateId = :stateId")
        List<district> findByStateId(@Param("stateId") int id);

}
