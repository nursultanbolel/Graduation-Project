package com.bitirmeprojesi.databaseService.business.bankaCalisanlariCevaplari;

import com.bitirmeprojesi.databaseService.dal.bankaCalisanlariCevaplari.IBankaCalisanlariCevaplariDal;
import com.bitirmeprojesi.databaseService.entities.BankaCalisanlariCevaplari;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class BankaCalisanlariCevaplariManager implements IBankaCalisanlariCevaplariService {

    private IBankaCalisanlariCevaplariDal iBankaCalisanlariCevaplariDal;

    @Autowired
    public BankaCalisanlariCevaplariManager(IBankaCalisanlariCevaplariDal iBankaCalisanlariCevaplariDal) {
        this.iBankaCalisanlariCevaplariDal = iBankaCalisanlariCevaplariDal;
    }

    @Override
    @Transactional
    public List<BankaCalisanlariCevaplari> getAll() {
        return this.iBankaCalisanlariCevaplariDal.getAll();
    }

    @Override
    public List<BankaCalisanlariCevaplari> getBySikayetId(int sikayetId) {
        return this.iBankaCalisanlariCevaplariDal.getBySikayetId(sikayetId);
    }

    @Override
    @Transactional
    public BankaCalisanlariCevaplari getById(int id) {
        return this.iBankaCalisanlariCevaplariDal.getById(id);
    }

    @Override
    @Transactional
    public void add(BankaCalisanlariCevaplari bankaCalisanlariCevabi) {
        this.iBankaCalisanlariCevaplariDal.add(bankaCalisanlariCevabi);
    }

    @Override
    @Transactional
    public void update(BankaCalisanlariCevaplari bankaCalisanlariCevabi) {
        this.iBankaCalisanlariCevaplariDal.update(bankaCalisanlariCevabi);
    }

    @Override
    @Transactional
    public void delete(BankaCalisanlariCevaplari bankaCalisanlariCevabi) {
        this.iBankaCalisanlariCevaplariDal.delete(bankaCalisanlariCevabi);
    }
}
