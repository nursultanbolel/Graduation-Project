package com.bitirmeprojesi.databaseService.dal.bankaCalisanlari;

import com.bitirmeprojesi.databaseService.entities.BankaCalisanlari;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateBankaCalisanlariDal implements IBankaCalisanlariDal {

    private EntityManager entityManager;

    @Autowired
    public HibernateBankaCalisanlariDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<BankaCalisanlari> getAll() {
        Session session = this.entityManager.unwrap(Session.class);
        List<BankaCalisanlari> bankaCalisanlariList = session.createQuery("from BankaCalisanlari ").getResultList();
        return bankaCalisanlariList;
    }

    @Override
    @Transactional
    public BankaCalisanlari getById(int id) {
        Session session = this.entityManager.unwrap(Session.class);
        return session.get(BankaCalisanlari.class,id);
    }

    @Override
    @Transactional
    public void add(BankaCalisanlari bankaCalisani) {
        Session session = this.entityManager.unwrap(Session.class);
        session.save(bankaCalisani);
    }

    @Override
    @Transactional
    public void update(BankaCalisanlari bankaCalisani) {
        Session session = this.entityManager.unwrap(Session.class);
        session.saveOrUpdate(bankaCalisani);
    }

    @Override
    @Transactional
    public void delete(BankaCalisanlari bankaCalisani) {
        Session session = this.entityManager.unwrap(Session.class);
        bankaCalisani = session.get(BankaCalisanlari.class,bankaCalisani.getId());
        session.delete(bankaCalisani);
    }
}
