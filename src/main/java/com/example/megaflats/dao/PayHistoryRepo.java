package com.example.megaflats.dao;

import com.example.megaflats.models.entities.PayHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PayHistoryRepo extends JpaRepository<PayHistory,Long> {
}
