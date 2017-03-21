package com.mkyong.web.model;

import javax.persistence.*;

/**
 * Created by ttomaka on 21.03.2017.
 */

@Entity
@Table(name="osoba")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int userId;

    @Column(name = "imie")
    private String userFirstname;
    @Column(name = "nazwisko")
    private String userLastname;


    public User() {
    }

    public User(String username, String surname) {
        this.userFirstname = username;
        this.userLastname = surname;
    }

    public int getUserId() {
        return this.userId;
    }

    private void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserFirstname() {
        return userFirstname;
    }

    public void setUserFirstname(String userFirstname) {
        this.userFirstname = userFirstname;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;

    }
}