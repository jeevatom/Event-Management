package com.project.EventManagementsystem.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class district {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int districtId;

    String DistrictName;

    @ManyToOne
    @JoinColumn(referencedColumnName = "stateId")
    @JsonIgnore
    private state stateId;

}