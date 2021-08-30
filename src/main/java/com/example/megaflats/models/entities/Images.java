package com.example.megaflats.models.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "house_id")
    private House house_id;

    private String url;

    private int order_num;
}
