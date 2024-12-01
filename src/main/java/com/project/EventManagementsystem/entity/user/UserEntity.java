package com.project.EventManagementsystem.entity.user;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "user",name = "user_entity")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
}
