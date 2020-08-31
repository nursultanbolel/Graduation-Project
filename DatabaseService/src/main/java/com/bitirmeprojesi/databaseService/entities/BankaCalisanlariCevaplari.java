package com.bitirmeprojesi.databaseService.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "banka_calisanlari_cevaplari")
public class BankaCalisanlariCevaplari {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "banka_calisani_id")
    private int bankaCalisaniId;

    @Column(name = "sikayet_id")
    private int sikayetId;

    @Column(name = "mesaj")
    private String mesaj;

    @Column(name = "cevap_tarihi")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date cevapTarihi;

    public BankaCalisanlariCevaplari() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBankaCalisaniId() {
        return bankaCalisaniId;
    }

    public void setBankaCalisaniId(int bankaCalisaniId) {
        this.bankaCalisaniId = bankaCalisaniId;
    }

    public int getSikayetId() {
        return sikayetId;
    }

    public void setSikayetId(int sikayetId) {
        this.sikayetId = sikayetId;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public Date getCevapTarihi() {
        return cevapTarihi;
    }

    public void setCevapTarihi(Date cevapTarihi) {
        this.cevapTarihi = cevapTarihi;
    }
}
