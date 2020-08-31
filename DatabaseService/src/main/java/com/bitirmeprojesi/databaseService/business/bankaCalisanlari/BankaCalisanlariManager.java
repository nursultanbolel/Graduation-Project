package com.bitirmeprojesi.databaseService.business.bankaCalisanlari;

import com.bitirmeprojesi.databaseService.dal.bankaCalisanlari.IBankaCalisanlariDal;
import com.bitirmeprojesi.databaseService.entities.BankaCalisanlari;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class BankaCalisanlariManager implements IBankaCalisanlariService {

    private IBankaCalisanlariDal iBankaCalisanlariDal;

    @Autowired
    public BankaCalisanlariManager(IBankaCalisanlariDal iBankaCalisanlariDal) {
        this.iBankaCalisanlariDal = iBankaCalisanlariDal;
    }

    @Override
    @Transactional
    public List<BankaCalisanlari> getAll() {
        return this.iBankaCalisanlariDal.getAll();
    }

    @Override
    @Transactional
    public BankaCalisanlari getById(int id) {
        return this.iBankaCalisanlariDal.getById(id);
    }

    @Override
    @Transactional
    public void add(BankaCalisanlari bankaCalisani) {
        this.iBankaCalisanlariDal.add(bankaCalisani);
    }

    @Override
    @Transactional
    public void update(BankaCalisanlari bankaCalisani) {
        this.iBankaCalisanlariDal.update(bankaCalisani);
    }

    @Override
    @Transactional
    public void delete(BankaCalisanlari bankaCalisani) {
        this.iBankaCalisanlariDal.delete(bankaCalisani);
    }
}
