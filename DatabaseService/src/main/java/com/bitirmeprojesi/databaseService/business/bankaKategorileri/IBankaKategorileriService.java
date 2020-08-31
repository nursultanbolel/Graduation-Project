package com.bitirmeprojesi.databaseService.business.bankaKategorileri;

import com.bitirmeprojesi.databaseService.entities.BankaKategorileri;
import java.util.List;

public interface IBankaKategorileriService {
    List<BankaKategorileri> getAll();
    BankaKategorileri getById(int id);
    void add(BankaKategorileri bankaKategorisi);
    void update(BankaKategorileri bankaKategorisi);
    void delete(BankaKategorileri bankaKategorisi);
}
