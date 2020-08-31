package com.bitirmeprojesi.databaseService.dal.bankaCalisanlari;

import com.bitirmeprojesi.databaseService.entities.BankaCalisanlari;

import java.util.List;

public interface IBankaCalisanlariDal {
    List<BankaCalisanlari> getAll();
    BankaCalisanlari getById(int id);
    void add(BankaCalisanlari bankaCalisani);
    void update(BankaCalisanlari bankaCalisani);
    void delete(BankaCalisanlari bankaCalisani);
}
