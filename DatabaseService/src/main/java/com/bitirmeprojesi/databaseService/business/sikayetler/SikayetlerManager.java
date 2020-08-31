package com.bitirmeprojesi.databaseService.business.sikayetler;

import com.bitirmeprojesi.databaseService.dal.sikayetler.ISikayetlerDal;
import com.bitirmeprojesi.databaseService.entities.Sikayetler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class SikayetlerManager implements ISikayetlerService {

    private ISikayetlerDal iSikayetlerDal;

    @Autowired
    public SikayetlerManager(ISikayetlerDal iSikayetlerDal) {
        this.iSikayetlerDal = iSikayetlerDal;
    }

    @Override
    @Transactional
    public List<Sikayetler> getAll() {
        return this.iSikayetlerDal.getAll();
    }

    @Override
    @Transactional
    public Sikayetler getById(int id) {
        return this.iSikayetlerDal.getById(id);
    }

    @Override
    @Transactional
    public void add(Sikayetler sikayet) {
        this.iSikayetlerDal.add(sikayet);
    }

    @Override
    @Transactional
    public void update(Sikayetler sikayet) {
        this.iSikayetlerDal.update(sikayet);
    }

    @Override
    @Transactional
    public void delete(int id) {
        this.iSikayetlerDal.delete(id);
    }
}
