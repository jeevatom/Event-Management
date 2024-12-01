package com.project.EventManagementsystem.entity.common;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class state {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int stateId;


    String stateName;
}
