package com.bitirmeprojesi.databaseService.dal.sikayetler;

import com.bitirmeprojesi.databaseService.entities.Sikayetler;
import java.util.List;

public interface ISikayetlerDal {
    List<Sikayetler> getAll();
    Sikayetler getById(int id);
    void add(Sikayetler sikayet);
    void update(Sikayetler sikayet);
    void delete(int id);
}
