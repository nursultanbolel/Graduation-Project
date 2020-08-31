package com.bitirmeprojesi.databaseService.dal.bankaKategorileri;

import com.bitirmeprojesi.databaseService.entities.BankaKategorileri;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;

import java.util.List;

@Repository
public class HibernateBankaKategorileriDal implements IBankaKategorileriDal {

    private EntityManager entityManager;

    @Autowired
    public HibernateBankaKategorileriDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<BankaKategorileri> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<BankaKategorileri> bankaKategorileriList = session.createQuery("from BankaKategorileri").getResultList();
        return bankaKategorileriList;
    }

    @Override
    @Transactional
    public BankaKategorileri getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(BankaKategorileri.class,id);
    }

    @Override
    @Transactional
    public void add(BankaKategorileri bankaKategori) {
        Session session = entityManager.unwrap(Session.class);
        session.save(bankaKategori);
    }

    @Override
    @Transactional
    public void update(BankaKategorileri bankaKategori) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(bankaKategori);
    }

    @Override
    @Transactional
    public void delete(BankaKategorileri bankaKategori) {
        Session session = entityManager.unwrap(Session.class);
        bankaKategori = session.get(BankaKategorileri.class,bankaKategori.getId());
        session.delete(bankaKategori);
    }
}
