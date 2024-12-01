package com.project.EventManagementsystem.entity.admin;
import jakarta.persistence.*;
import lombok.Data;
import com.project.EventManagementsystem.entity.common.district;
import com.project.EventManagementsystem.entity.common.state;

@Data
@Entity
@Table(schema = "admin",name = "admin_table")
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    int ticketAvailability;

    int totalTickets;

    @ManyToOne
    @JoinColumn(referencedColumnName = "districtId")
   private district districtId;

    @ManyToOne
    @JoinColumn(referencedColumnName = "stateId")
    private state state;

    String eventName;

    String eventLocation;
}