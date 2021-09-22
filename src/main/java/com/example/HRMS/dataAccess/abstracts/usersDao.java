package com.example.HRMS.dataAccess.abstracts;

import com.example.HRMS.entities.abstracts.users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usersDao extends JpaRepository<users,Integer> {
}
