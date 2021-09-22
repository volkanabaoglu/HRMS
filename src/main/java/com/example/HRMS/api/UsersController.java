package com.example.HRMS.api;

import com.example.HRMS.business.abstracts.usersService;
import com.example.HRMS.entities.abstracts.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    private usersService usersService;
    @Autowired
    public UsersController(usersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/getAll")
    public List<users> getAll(){
        return this.usersService.getAll();
    }
}
