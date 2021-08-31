package com.example.megaflats.models.recievers;

import com.example.megaflats.models.entities.CityVillage;
import com.example.megaflats.models.entities.District;
import com.example.megaflats.models.entities.Types;
import com.example.megaflats.models.entities.Users;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Data
public class HouseReciever {

    private int rooms;

    private String description;

    private int floor;

    private int area;

    private int price;

    private Long types_id;

    private boolean internet;

    private boolean furniture;

    private Long users_id;

    private Long city_village_id;

    private Long district_id;

    private double lat;

    private double lon;

    private String address;
}
