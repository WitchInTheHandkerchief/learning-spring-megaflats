package com.example.megaflats.models.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int rooms;

    private String description;

    private int floor;

    private int area;

    private int price;

    @ManyToOne
    @JoinColumn(name ="types_id")
    private Types types_id;

    private boolean internet;

    private boolean furniture;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users_id;

    @ManyToOne
    @JoinColumn(name = "city_village_id")
    private CityVillage city_village_id;

    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district_id;

    @CreationTimestamp
    private LocalDate add_date;

    @UpdateTimestamp
    private LocalDate edit_date;

    private double lat;

    private double lon;

    private String address;
}
