package com.mkyong.web.repo;

/**
 * Created by ttomaka on 22.03.2017.
 */
public class ContactDTO {
    private String value;
    private int typeId;


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

}
