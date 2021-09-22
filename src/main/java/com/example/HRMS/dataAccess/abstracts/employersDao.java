package com.example.HRMS.dataAccess.abstracts;

import com.example.HRMS.entities.concretes.employers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employersDao extends JpaRepository<employers,Integer> {
}
