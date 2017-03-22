package com.mkyong.web.model;

import javax.persistence.*;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

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

    public enum Type {
        TELEFON(1),
        EMAIL(2);


        private int code;

        private Type(int code) {
            this.code = code;
        }
        private static final Map<Integer,Type> lookup
                = new HashMap<Integer,Type>();

        static {
            for(Type s : EnumSet.allOf(Type.class))
                lookup.put(s.getCode(), s);
        }
        public int getCode() { return code; }

        public static Type get(int code) {
            return lookup.get(code);
        }
    }
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
