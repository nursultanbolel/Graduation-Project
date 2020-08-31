package com.bitirmeprojesi.databaseService.dal.bankaKategorileri;

import com.bitirmeprojesi.databaseService.entities.BankaKategorileri;
import java.util.List;

public interface IBankaKategorileriDal {
    List<BankaKategorileri> getAll();
    BankaKategorileri getById(int id);
    void add(BankaKategorileri bankaKategori);
    void update(BankaKategorileri bankaKategori);
    void delete(BankaKategorileri bankaKategori);

}
