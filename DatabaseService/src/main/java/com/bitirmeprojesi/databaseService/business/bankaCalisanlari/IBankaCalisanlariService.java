package com.bitirmeprojesi.databaseService.business.bankaCalisanlari;

import com.bitirmeprojesi.databaseService.entities.BankaCalisanlari;

import java.util.List;

public interface IBankaCalisanlariService {
    List<BankaCalisanlari> getAll();
    BankaCalisanlari getById(int id);
    void add(BankaCalisanlari bankaCalisani);
    void update(BankaCalisanlari bankaCalisani);
    void delete(BankaCalisanlari bankaCalisani);
}
