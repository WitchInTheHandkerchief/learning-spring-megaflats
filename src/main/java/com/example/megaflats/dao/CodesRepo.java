package com.example.megaflats.dao;

import com.example.megaflats.models.entities.Codes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodesRepo extends JpaRepository<Codes,Long> {
}
