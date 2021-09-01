package com.example.megaflats.dao;

import com.example.megaflats.models.entities.Codes;
import com.example.megaflats.models.enums.CodeStatus;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodesRepo extends JpaRepository<Codes,Long> {
    Codes findCodesByUsers_id(Long user_id);
}
