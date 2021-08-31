package com.example.megaflats.dao;

import com.example.megaflats.models.entities.Types;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypesRepo extends JpaRepository<Types,Long> {
    Types findTypesById(Long id);
}
