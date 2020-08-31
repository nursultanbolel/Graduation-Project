package com.bitirmeprojesi.databaseService.dal.bankaCalisanlariCevaplari;

import com.bitirmeprojesi.databaseService.entities.BankaCalisanlariCevaplari;
import java.util.List;

public interface IBankaCalisanlariCevaplariDal {
    List<BankaCalisanlariCevaplari> getAll();
    List<BankaCalisanlariCevaplari> getBySikayetId(int sikayetId);
    BankaCalisanlariCevaplari getById(int id);
    void add(BankaCalisanlariCevaplari bankaCalisanlariCevabi);
    void update(BankaCalisanlariCevaplari bankaCalisanlariCevabi);
    void delete(BankaCalisanlariCevaplari bankaCalisanlariCevabi);
}
