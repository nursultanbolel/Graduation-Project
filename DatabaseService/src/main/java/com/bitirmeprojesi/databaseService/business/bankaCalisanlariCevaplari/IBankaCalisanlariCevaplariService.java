package com.bitirmeprojesi.databaseService.business.bankaCalisanlariCevaplari;

import com.bitirmeprojesi.databaseService.entities.BankaCalisanlariCevaplari;
import java.util.List;

public interface IBankaCalisanlariCevaplariService {
    List<BankaCalisanlariCevaplari> getAll();
    List<BankaCalisanlariCevaplari> getBySikayetId(int sikayetId);
    BankaCalisanlariCevaplari getById(int id);
    void add(BankaCalisanlariCevaplari bankaCalisanlariCevabi);
    void update(BankaCalisanlariCevaplari bankaCalisanlariCevabi);
    void delete(BankaCalisanlariCevaplari bankaCalisanlariCevabi);
}
