package com.example.HRMS.business.concretes;

import com.example.HRMS.business.abstracts.candidatesService;
import com.example.HRMS.dataAccess.abstracts.candidatesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class candidatesManager implements candidatesService {

    private candidatesDao candidatesDao;

    @Autowired

    public candidatesManager(com.example.HRMS.dataAccess.abstracts.candidatesDao candidatesDao) {
        this.candidatesDao = candidatesDao;
    }


}
