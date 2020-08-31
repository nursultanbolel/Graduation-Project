package com.bitirmeprojesi.databaseService.dal.kullaniciCevaplari;

import com.bitirmeprojesi.databaseService.entities.KullaniciCevaplari;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class KullaniciCevaplariDal implements IKullaniciCevaplariDal {

    private EntityManager entityManager;

    @Autowired
    public KullaniciCevaplariDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<KullaniciCevaplari> getAll() {
        Session session = this.entityManager.unwrap(Session.class);
        List<KullaniciCevaplari> kullaniciCevaplariList = session.createQuery("from KullaniciCevaplari").getResultList();
        return kullaniciCevaplariList;
    }

    @Override
    public List<KullaniciCevaplari> getBySikayetId(int sikayetId) {
        Session session = this.entityManager.unwrap(Session.class);
        List<KullaniciCevaplari> kullaniciCevaplariList = session.createQuery("from KullaniciCevaplari where sikayetId=" + sikayetId).getResultList();
        return kullaniciCevaplariList;
    }

    @Override
    @Transactional
    public KullaniciCevaplari getById(int id) {
        Session session = this.entityManager.unwrap(Session.class);
        return session.get(KullaniciCevaplari.class,id);
    }

    @Override
    @Transactional
    public void add(KullaniciCevaplari kullaniciCevabi) {
        Session session = this.entityManager.unwrap(Session.class);
        session.save(kullaniciCevabi);
    }

    @Override
    @Transactional
    public void update(KullaniciCevaplari kullaniciCevabi) {
        Session session = this.entityManager.unwrap(Session.class);
        session.saveOrUpdate(kullaniciCevabi);
    }

    @Override
    @Transactional
    public void delete(KullaniciCevaplari kullaniciCevabi) {
        Session session = this.entityManager.unwrap(Session.class);
        kullaniciCevabi = session.get(KullaniciCevaplari.class,kullaniciCevabi.getId());
        session.delete(kullaniciCevabi);
    }
}
