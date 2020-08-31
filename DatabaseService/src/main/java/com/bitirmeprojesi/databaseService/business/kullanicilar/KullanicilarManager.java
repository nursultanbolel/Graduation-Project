package com.bitirmeprojesi.databaseService.business.kullanicilar;

import com.bitirmeprojesi.databaseService.dal.kullanicilar.IKulllanicilarDal;
import com.bitirmeprojesi.databaseService.entities.Kullanicilar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class KullanicilarManager implements IKullanicilarService {

    private IKulllanicilarDal kulllanicilarDal;

    @Autowired
    public KullanicilarManager(IKulllanicilarDal kulllanicilarDal) {
        this.kulllanicilarDal = kulllanicilarDal;
    }

    @Override
    @Transactional
    public List<Kullanicilar> getAll() {
        return this.kulllanicilarDal.getAll();
    }

    @Override
    @Transactional
    public Kullanicilar getById(int id) {
        return this.kulllanicilarDal.getById(id);
    }

    @Override
    @Transactional
    public void add(Kullanicilar kullanici) {
        this.kulllanicilarDal.add(kullanici);
    }

    @Override
    @Transactional
    public void update(Kullanicilar kullanici) {
        this.kulllanicilarDal.update(kullanici);
    }

    @Override
    @Transactional
    public void delete(Kullanicilar kullanici) {
        this.kulllanicilarDal.delete(kullanici);
    }
}
