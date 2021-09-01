package com.example.megaflats.dao;

import com.example.megaflats.models.entities.Requests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestsRepo extends JpaRepository<Requests,Long> {
    Long countAllByCodes_idAndSuccess(Long code_id, boolean success);
}
