package com.bitirmeprojesi.databaseService.dal.bankaCalisanlariCevaplari;

import com.bitirmeprojesi.databaseService.entities.BankaCalisanlariCevaplari;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateBankaCalisanlariCevaplariDal implements IBankaCalisanlariCevaplariDal {

    private EntityManager entityManager;

    @Autowired
    public HibernateBankaCalisanlariCevaplariDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<BankaCalisanlariCevaplari> getAll() {
        Session session = this.entityManager.unwrap(Session.class);
        List<BankaCalisanlariCevaplari> bankaCalisanlariCevaplariList = session.createQuery("from BankaCalisanlariCevaplari").getResultList();
        return bankaCalisanlariCevaplariList;
    }

    @Override
    public List<BankaCalisanlariCevaplari> getBySikayetId(int sikayetId) {
        Session session = this.entityManager.unwrap(Session.class);
        List<BankaCalisanlariCevaplari> bankaCalisanlariCevaplariList = session.createQuery("from BankaCalisanlariCevaplari where sikayetId=" + sikayetId).getResultList();
        return bankaCalisanlariCevaplariList;
    }

    @Override
    @Transactional
    public BankaCalisanlariCevaplari getById(int id) {
        Session session = this.entityManager.unwrap(Session.class);
        return session.get(BankaCalisanlariCevaplari.class,id);
    }

    @Override
    @Transactional
    public void add(BankaCalisanlariCevaplari bankaCalisanlariCevabi) {
        Session session = this.entityManager.unwrap(Session.class);
        session.save(bankaCalisanlariCevabi);
    }

    @Override
    @Transactional
    public void update(BankaCalisanlariCevaplari bankaCalisanlariCevabi) {
        Session session = this.entityManager.unwrap(Session.class);
        session.saveOrUpdate(bankaCalisanlariCevabi);
    }

    @Override
    @Transactional
    public void delete(BankaCalisanlariCevaplari bankaCalisanlariCevabi) {
        Session session = this.entityManager.unwrap(Session.class);
        bankaCalisanlariCevabi = session.get(BankaCalisanlariCevaplari.class,bankaCalisanlariCevabi.getId());
        session.delete(bankaCalisanlariCevabi);
    }
}
