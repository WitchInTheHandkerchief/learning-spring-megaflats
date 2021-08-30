package com.example.megaflats.models.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "city_village_id")
    private CityVillage city_village_id;

    private String name;
}
