package com.bitirmeprojesi.databaseService.business.bankaKategorileri;

import com.bitirmeprojesi.databaseService.dal.bankaKategorileri.IBankaKategorileriDal;
import com.bitirmeprojesi.databaseService.entities.BankaKategorileri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class BankaKategorileriManager implements IBankaKategorileriService{

    private IBankaKategorileriDal bankaKategorileriDal;

    @Autowired
    public BankaKategorileriManager(IBankaKategorileriDal bankaKategorileriDal) {
        this.bankaKategorileriDal = bankaKategorileriDal;
    }

    @Override
    @Transactional
    public List<BankaKategorileri> getAll() {
        return this.bankaKategorileriDal.getAll();
    }

    @Override
    @Transactional
    public BankaKategorileri getById(int id) {
        return this.bankaKategorileriDal.getById(id);
    }

    @Override
    @Transactional
    public void add(BankaKategorileri bankaKategorisi) {
        this.bankaKategorileriDal.add(bankaKategorisi);
    }

    @Override
    @Transactional
    public void update(BankaKategorileri bankaKategorisi) {
        this.bankaKategorileriDal.update(bankaKategorisi);
    }

    @Override
    @Transactional
    public void delete(BankaKategorileri bankaKategorisi) {
        this.bankaKategorileriDal.delete(bankaKategorisi);
    }
}
