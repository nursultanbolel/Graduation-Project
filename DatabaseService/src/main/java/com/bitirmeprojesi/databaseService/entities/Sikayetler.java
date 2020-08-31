package com.bitirmeprojesi.databaseService.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sikayetler")
public class Sikayetler {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "sikayeti_yapan_kisi")
    private int sikayetiYapanKisi;

    @Column(name = "banka_id")
    private int bankaId;

    @Column(name = "sikayet_basligi")
    private String sikayetBasligi;

    @Column(name = "sikayet_telefon_no")
    private String sikayetTelefonNo;

    @Column(name = "sikayet_icerigi")
    private String sikayetIcerigi;

    @Column(name = "sikayet_tarihi")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date sikayetTarihi;

    @Column(name = "sikayet_kategorisi")
    private int sikayetKategorisi;

    @Column(name = "is_solved")
    private boolean isSolved;

    public Sikayetler() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSikayetiYapanKisi() {
        return sikayetiYapanKisi;
    }

    public void setSikayetiYapanKisi(int sikayetiYapanKisi) {
        this.sikayetiYapanKisi = sikayetiYapanKisi;
    }

    public int getBankaId() {
        return bankaId;
    }

    public void setBankaId(int bankaId) {
        this.bankaId = bankaId;
    }

    public String getSikayetBasligi() {
        return sikayetBasligi;
    }

    public void setSikayetBasligi(String sikayetBasligi) {
        this.sikayetBasligi = sikayetBasligi;
    }

    public String getSikayetTelefonNo() {
        return sikayetTelefonNo;
    }

    public void setSikayetTelefonNo(String sikayetTelefonNo) {
        this.sikayetTelefonNo = sikayetTelefonNo;
    }

    public String getSikayetIcerigi() {
        return sikayetIcerigi;
    }

    public void setSikayetIcerigi(String sikayetIcerigi) {
        this.sikayetIcerigi = sikayetIcerigi;
    }

    public Date getSikayetTarihi() {
        return sikayetTarihi;
    }

    public void setSikayetTarihi(Date sikayetTarihi) {
        this.sikayetTarihi = sikayetTarihi;
    }

    public int getSikayetKategorisi() {
        return sikayetKategorisi;
    }

    public void setSikayetKategorisi(int sikayetKategorisi) {
        this.sikayetKategorisi = sikayetKategorisi;
    }

    public boolean getIsSolved() {
        return isSolved;
    }

    public void setIsSolved(boolean solved) {
        isSolved = solved;
    }
}
