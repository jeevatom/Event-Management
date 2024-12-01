package com.project.EventManagementsystem.entity.admin;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "admin",name = "admin_table")
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    int ticketAvailability;

    int totalTickets;

    int districtId;

    int stateId;

    String eventName;

    String eventLocation;
}