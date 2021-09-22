package com.example.HRMS.dataAccess.abstracts;

import com.example.HRMS.entities.concretes.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeDao extends JpaRepository<employee,Integer> {
}
