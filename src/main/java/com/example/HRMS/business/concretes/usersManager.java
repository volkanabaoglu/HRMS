package com.example.HRMS.business.concretes;

import com.example.HRMS.business.abstracts.usersService;
import com.example.HRMS.dataAccess.abstracts.usersDao;
import com.example.HRMS.entities.abstracts.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class usersManager implements usersService {
    private usersDao userDao;
    @Autowired
    public usersManager(usersDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<users> getAll() {
        return null;
    }
}
