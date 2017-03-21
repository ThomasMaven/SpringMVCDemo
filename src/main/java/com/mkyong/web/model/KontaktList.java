package com.mkyong.web.model;

import javax.persistence.*;

/**
 * Created by ttomaka on 21.03.2017.
 */
@Entity
@Table(name="kontakt_list")
public class KontaktList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "id_os")
    private int idOsoby;

    @Column(name = "id_kontaktu")
    private int idKontaktu;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name ="id_os", insertable = false, updatable=false)
    private User osoba;
    @ManyToOne(targetEntity = Kontakt.class, fetch = FetchType.EAGER)
    @JoinColumn(name ="id_kontaktu", insertable = false, updatable=false)
    private Kontakt kontakt;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdOsoby() {
        return idOsoby;
    }

    public void setIdOsoby(int idOsoby) {
        this.idOsoby = idOsoby;
    }

    public int getIdKontaktu() {
        return idKontaktu;
    }

    public void setIdKontaktu(int idKontaktu) {
        this.idKontaktu = idKontaktu;
    }


    @Override
    public String toString() {
        return "Id: " + getId() + " User: " + osoba.getUserFirstname() + "  " + osoba.getUserLastname()
                + " Value: " + kontakt.getValue() + "<br>";
    }





}
