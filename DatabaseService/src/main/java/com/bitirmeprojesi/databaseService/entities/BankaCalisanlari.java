package com.bitirmeprojesi.databaseService.entities;

import javax.persistence.*;

@Entity
@Table(name = "banka_calisanlari")
public class BankaCalisanlari {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ad_soyad")
    private String adSoyad;

    @Column(name="email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "calistigi_banka")
    private int calistigiBanka;

    @Column(name = "calistigi_departman")
    private int calistigiDepartman;

    public BankaCalisanlari() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCalistigiBanka() {
        return calistigiBanka;
    }

    public void setCalistigiBanka(int calistigiBanka) {
        this.calistigiBanka = calistigiBanka;
    }

    public int getCalistigiDepartman() {
        return calistigiDepartman;
    }

    public void setCalistigiDepartman(int calistigiDepartman) {
        this.calistigiDepartman = calistigiDepartman;
    }
}
