package com.bitirmeprojesi.databaseService.dal.kullanicilar;

import com.bitirmeprojesi.databaseService.entities.Kullanicilar;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class HibernateKullanicilarDal implements IKulllanicilarDal {

    private EntityManager entityManager;

    @Autowired
    public HibernateKullanicilarDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Kullanicilar> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Kullanicilar> kullanicilarList = session.createQuery("from Kullanicilar").getResultList();
        return kullanicilarList;
    }

    @Override
    @Transactional
    public Kullanicilar getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return  session.get(Kullanicilar.class,id);
    }

    @Override
    @Transactional
    public void add(Kullanicilar kullanici) {
        Session session = entityManager.unwrap(Session.class);
        session.save(kullanici);
    }

    @Override
    @Transactional
    public void update(Kullanicilar kullanici) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(kullanici);
    }

    @Override
    @Transactional
    public void delete(Kullanicilar kullanici) {
        Session session = entityManager.unwrap(Session.class);
        kullanici = session.get(Kullanicilar.class,kullanici.getId());
        session.delete(kullanici);
    }
}
