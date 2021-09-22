package com.example.HRMS.entities.abstracts;
import lombok.Data;
import javax.persistence.*;
@Data
@Entity
@Table(name = "users")
public class users {
    @Id
    @GeneratedValue
    @Column (name = "id")
    private int id;
    @Column(name = "email")
    private String email;
    @Column (name = "password")
    private String password;

    public users(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public users(){

    }



    public void setId(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }
}
