package com.bitirmeprojesi.databaseService.dal.bankalar;

import com.bitirmeprojesi.databaseService.entities.Bankalar;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class HibernateBankalarDal implements IBankalarDal {

    private EntityManager entityManager;

    @Autowired
    public HibernateBankalarDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Bankalar> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Bankalar> bankalarList = session.createQuery("from Bankalar").getResultList();
        return  bankalarList;
    }

    @Override
    @Transactional
    public Bankalar getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return  session.get(Bankalar.class,id);
    }

    @Override
    @Transactional
    public void add(Bankalar banka) {
        Session session = entityManager.unwrap(Session.class);
        session.save(banka);
    }

    @Override
    @Transactional
    public void update(Bankalar banka) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(banka);
    }

    @Override
    @Transactional
    public void delete(Bankalar banka) {
        Session session = entityManager.unwrap(Session.class);
        banka = session.get(Bankalar.class,banka.getId());
        session.delete(banka);
    }
}
