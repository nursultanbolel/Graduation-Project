package com.bitirmeprojesi.databaseService.business.kullaniciCevaplari;

import com.bitirmeprojesi.databaseService.entities.KullaniciCevaplari;
import java.util.List;

public interface IKullaniciCevaplariService {
    List<KullaniciCevaplari> getAll();
    List<KullaniciCevaplari> getBySikayetId(int sikayetId);
    KullaniciCevaplari getById(int id);
    void add(KullaniciCevaplari kullaniciCevabi);
    void update(KullaniciCevaplari kullaniciCevabi);
    void delete(KullaniciCevaplari kullaniciCevabi);
}
