package com.mkyong.web.repo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ttomaka on 22.03.2017.
 */
public class UserDTO {

    private String name;
    private String surname;

    public List<ContactDTO> getContacts() {
        return contacts;
    }

    public void setContacts(List<ContactDTO> contacts) {
        this.contacts = contacts;
    }

    private List<ContactDTO> contacts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    //name="contacts[0]. contacts[1]


}

