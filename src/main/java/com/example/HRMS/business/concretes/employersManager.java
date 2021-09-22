package com.example.HRMS.business.concretes;

import com.example.HRMS.business.abstracts.employersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class employersManager implements employersService {
    private employersManager employersManager;
    @Autowired
    public employersManager(com.example.HRMS.business.concretes.employersManager employersManager) {
        this.employersManager = employersManager;
    }
}
