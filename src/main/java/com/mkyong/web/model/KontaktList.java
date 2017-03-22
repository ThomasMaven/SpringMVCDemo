package com.mkyong.web.model;

import javax.persistence.*;

/**
 * Created by ttomaka on 21.03.2017.
 */
@Entity
@Table(name = "kontakt_list")
public class KontaktList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @OneToOne(cascade = {CascadeType.ALL}, optional = false)
    @JoinColumn(name = "id_os", referencedColumnName = "id", nullable = false)
    private User osoba;


    @OneToOne(cascade = {CascadeType.ALL}, optional = false)
    @JoinColumn(name = "id_kontaktu", referencedColumnName = "id", nullable = false)
    private Kontakt kontakt;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public KontaktList() {
    }

    public KontaktList(User osoba, Kontakt kontakt) {
        this.osoba = osoba;
        this.kontakt = kontakt;
    }

    @Override
    public String toString() {
        return "Id: " + getId() + " User: " + osoba.getUserFirstname() + "  " + osoba.getUserLastname()
                + " Value: " + kontakt.getValue() + " Type: "
                + Kontakt.Type.get(kontakt.getTypeId()) + "<br>";
    }



    public User getOsoba() {
        return osoba;
    }

    public void setOsoba(User osoba) {
        this.osoba = osoba;
    }

    public Kontakt getKontakt() {
        return kontakt;
    }

    public void setKontakt(Kontakt kontakt) {
        this.kontakt = kontakt;
    }


}
