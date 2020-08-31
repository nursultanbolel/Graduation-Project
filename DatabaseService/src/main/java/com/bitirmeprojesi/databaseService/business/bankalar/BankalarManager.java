package com.bitirmeprojesi.databaseService.business.bankalar;

import com.bitirmeprojesi.databaseService.dal.bankalar.IBankalarDal;
import com.bitirmeprojesi.databaseService.entities.Bankalar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class BankalarManager implements IBankalarService {

    private IBankalarDal bankalarDal;

    @Autowired
    public BankalarManager(IBankalarDal bankalarDal) {
        this.bankalarDal = bankalarDal;
    }

    @Override
    @Transactional
    public List<Bankalar> getAll() {
        return this.bankalarDal.getAll();
    }

    @Override
    @Transactional
    public Bankalar getById(int id) {
        return this.bankalarDal.getById(id);
    }

    @Override
    @Transactional
    public void add(Bankalar banka) {
        this.bankalarDal.add(banka);
    }

    @Override
    @Transactional
    public void update(Bankalar banka) {
        this.bankalarDal.update(banka);
    }

    @Override
    @Transactional
    public void delete(Bankalar banka) {
        this.bankalarDal.delete(banka);
    }
}
