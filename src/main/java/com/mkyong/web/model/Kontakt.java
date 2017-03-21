package com.mkyong.web.model;

import javax.persistence.*;

/**
 * Created by ttomaka on 21.03.2017.
 */
@Entity
@Table
public class Kontakt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name = "wartosc")
    private String value;
    @Column(name = "typ_id")
    private int typeId;

    public Kontakt() {}

    public Kontakt(int typeId, String value) {
        this.typeId = typeId;
        this.value = value;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
