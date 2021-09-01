package com.example.megaflats.dao;

import com.example.megaflats.models.entities.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseRepo extends JpaRepository<House,Long> {
    List<House> findByRooms(int room);
    List<House> findByFloor(int floor);
    List<House> findByInternet(boolean internet);
    List<House> findByFurniture(boolean furniture);
}
