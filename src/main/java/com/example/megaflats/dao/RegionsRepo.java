package com.example.megaflats.dao;

import com.example.megaflats.models.entities.Regions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionsRepo extends JpaRepository<Regions,Long> {
}
