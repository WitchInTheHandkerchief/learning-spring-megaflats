package com.example.megaflats.models.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CityVillage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "regions_id")
    private Regions regions_id;

    private String name;
}
