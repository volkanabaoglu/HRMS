package com.example.HRMS.entities.concretes;
import com.example.HRMS.entities.abstracts.users;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "employees")
public class employee extends users {
    @GeneratedValue
    @Column
    private String fırs_name;
    @Column
    private String last_name;
}
