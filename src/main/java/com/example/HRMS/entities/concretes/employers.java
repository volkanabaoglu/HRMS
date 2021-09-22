package com.example.HRMS.entities.concretes;

import com.example.HRMS.entities.abstracts.users;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
@Data
@Entity
@Table(name = "employers")
public class employers extends users {
    @GeneratedValue
    @Column
    private String company_name;
    @Column
    private String web_adress;
    @Column
    private String phone_number;

    public employers(int id, String email, String password, String company_name, String web_adress, String phone_number) {
        super(id, email, password);
        this.company_name = company_name;
        this.web_adress = web_adress;
        this.phone_number = phone_number;
    }

    public employers(String company_name, String web_adress, String phone_number) {
        this.company_name = company_name;
        this.web_adress = web_adress;
        this.phone_number = phone_number;
    }

    public employers() {

    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getWeb_adress() {
        return web_adress;
    }

    public void setWeb_adress(String web_adress) {
        this.web_adress = web_adress;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
