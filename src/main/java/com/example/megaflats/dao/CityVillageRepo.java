package com.example.megaflats.dao;

import com.example.megaflats.models.entities.CityVillage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityVillageRepo extends JpaRepository<CityVillage,Long> {
    CityVillage findCityVillageById(Long id);
}
