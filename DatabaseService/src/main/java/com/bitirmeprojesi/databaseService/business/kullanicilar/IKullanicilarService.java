package com.bitirmeprojesi.databaseService.business.kullanicilar;

import com.bitirmeprojesi.databaseService.entities.Kullanicilar;
import java.util.List;

public interface IKullanicilarService {
    List<Kullanicilar> getAll();
    Kullanicilar getById(int id);
    void add(Kullanicilar kullanici);
    void update(Kullanicilar kullanici);
    void delete(Kullanicilar kullanici);
}
