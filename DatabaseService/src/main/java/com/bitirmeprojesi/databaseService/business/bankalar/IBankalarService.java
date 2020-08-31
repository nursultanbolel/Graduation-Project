package com.bitirmeprojesi.databaseService.business.bankalar;

import com.bitirmeprojesi.databaseService.entities.Bankalar;
import java.util.List;

public interface IBankalarService {
    List<Bankalar> getAll();
    Bankalar getById(int id);
    void add(Bankalar banka);
    void update(Bankalar banka);
    void delete(Bankalar banka);
}
