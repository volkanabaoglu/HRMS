package com.example.HRMS.entities.concretes;

import com.example.HRMS.entities.abstracts.users;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
@Data
@Entity
@Table(name = "candidates")
public class candidates extends users {
    @GeneratedValue
    @Column
    private String fırs_name;
    @Column
    private String last_name;
    @Column
    private String identity_number;
    @Column
    private int birth_year;

    public candidates(int id, String email, String password, String fırs_name) {
        super(id, email, password);
        this.fırs_name = fırs_name;
    }

    public candidates(String fırs_name) {
        this.fırs_name = fırs_name;
    }

    public candidates() {

    }

    public String getFırs_name() {

        return fırs_name;
    }

    public void setFırs_name(String fırs_name) {
        this.fırs_name = fırs_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getIdentity_number() {
        return identity_number;
    }

    public void setIdentity_number(String identity_number) {
        this.identity_number = identity_number;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }
}
