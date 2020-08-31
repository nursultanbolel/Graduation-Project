package com.bitirmeprojesi.databaseService.dal.bankalar;

import com.bitirmeprojesi.databaseService.entities.Bankalar;
import java.util.List;

public interface IBankalarDal {
    List<Bankalar> getAll();
    Bankalar getById(int id);
    void add(Bankalar banka);
    void update(Bankalar banka);
    void delete(Bankalar banka);
}
