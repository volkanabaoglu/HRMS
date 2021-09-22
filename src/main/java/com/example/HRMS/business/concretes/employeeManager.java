package com.example.HRMS.business.concretes;

import com.example.HRMS.business.abstracts.employeeService;
import com.example.HRMS.dataAccess.abstracts.employeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class employeeManager implements employeeService {
    private employeeDao employeeDao;
    @Autowired
    public employeeManager(com.example.HRMS.dataAccess.abstracts.employeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}
