package com.bitirmeprojesi.databaseService.business.sikayetler;

import com.bitirmeprojesi.databaseService.entities.Sikayetler;
import java.util.List;

public interface ISikayetlerService {
    List<Sikayetler> getAll();
    Sikayetler getById(int id);
    void add(Sikayetler sikayet);
    void update(Sikayetler sikayet);
    void delete(int id);
}
