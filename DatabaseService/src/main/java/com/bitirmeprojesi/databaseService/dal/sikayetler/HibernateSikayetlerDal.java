package com.bitirmeprojesi.databaseService.dal.sikayetler;

import com.bitirmeprojesi.databaseService.entities.Sikayetler;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateSikayetlerDal implements ISikayetlerDal {

    private EntityManager entityManager;

    @Autowired
    public HibernateSikayetlerDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Sikayetler> getAll() {
        Session session = this.entityManager.unwrap(Session.class);
        List<Sikayetler> sikayetler = session.createQuery("from Sikayetler order by sikayetTarihi desc ").getResultList();
        return sikayetler;
    }

    @Override
    @Transactional
    public Sikayetler getById(int id) {
        Session session = this.entityManager.unwrap(Session.class);
        Sikayetler sikayet = session.get(Sikayetler.class,id);
        return sikayet;
    }

    @Override
    @Transactional
    public void add(Sikayetler sikayet) {
        Session session = this.entityManager.unwrap(Session.class);
        session.save(sikayet);
    }

    @Override
    @Transactional
    public void update(Sikayetler sikayet) {
        Session session = this.entityManager.unwrap(Session.class);
        session.saveOrUpdate(sikayet);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Session session = this.entityManager.unwrap(Session.class);
        Sikayetler sikayetler = session.get(Sikayetler.class, id);
        session.delete(sikayetler);
    }
}
