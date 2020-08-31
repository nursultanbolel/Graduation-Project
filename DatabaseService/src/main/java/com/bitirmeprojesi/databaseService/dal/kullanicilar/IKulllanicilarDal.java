package com.bitirmeprojesi.databaseService.dal.kullanicilar;

import com.bitirmeprojesi.databaseService.entities.Kullanicilar;
import java.util.List;

public interface IKulllanicilarDal {
    List<Kullanicilar> getAll();
    Kullanicilar getById(int id);
    void add(Kullanicilar kullanici);
    void update(Kullanicilar kullanici);
    void delete(Kullanicilar kullanici);
}
