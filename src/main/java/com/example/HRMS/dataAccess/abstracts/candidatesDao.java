package com.example.HRMS.dataAccess.abstracts;

import com.example.HRMS.entities.concretes.candidates;
import org.springframework.data.jpa.repository.JpaRepository;

public interface candidatesDao extends JpaRepository<candidates,Integer> {
}
