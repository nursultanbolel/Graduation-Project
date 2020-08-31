package com.bitirmeprojesi.databaseService.business.kullaniciCevaplari;

import com.bitirmeprojesi.databaseService.dal.kullaniciCevaplari.IKullaniciCevaplariDal;
import com.bitirmeprojesi.databaseService.entities.KullaniciCevaplari;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class KullaniciCevaplariManager implements IKullaniciCevaplariService {

    private IKullaniciCevaplariDal iKullaniciCevaplariDal;

    @Autowired
    public KullaniciCevaplariManager(IKullaniciCevaplariDal iKullaniciCevaplariDal) {
        this.iKullaniciCevaplariDal = iKullaniciCevaplariDal;
    }

    @Override
    @Transactional
    public List<KullaniciCevaplari> getAll() {
        return this.iKullaniciCevaplariDal.getAll();
    }

    @Override
    public List<KullaniciCevaplari> getBySikayetId(int sikayetId) {
        return this.iKullaniciCevaplariDal.getBySikayetId(sikayetId);
    }

    @Override
    @Transactional
    public KullaniciCevaplari getById(int id) {
        return this.iKullaniciCevaplariDal.getById(id);
    }

    @Override
    @Transactional
    public void add(KullaniciCevaplari kullaniciCevabi) {
        this.iKullaniciCevaplariDal.add(kullaniciCevabi);
    }

    @Override
    @Transactional
    public void update(KullaniciCevaplari kullaniciCevabi) {
        this.iKullaniciCevaplariDal.update(kullaniciCevabi);
    }

    @Override
    @Transactional
    public void delete(KullaniciCevaplari kullaniciCevabi) {
        this.iKullaniciCevaplariDal.delete(kullaniciCevabi);
    }
}
