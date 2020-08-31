package com.bitirmeprojesi.databaseService.restcontroller;


import com.bitirmeprojesi.databaseService.business.bankaCalisanlari.IBankaCalisanlariService;
import com.bitirmeprojesi.databaseService.entities.BankaCalisanlari;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bankaCalisanlari")
public class BankaCalisanlariController {

    private IBankaCalisanlariService iBankaCalisanlariService;

    @Autowired
    public BankaCalisanlariController(IBankaCalisanlariService iBankaCalisanlariService) {
        this.iBankaCalisanlariService = iBankaCalisanlariService;
    }

    @GetMapping("/getAll")
    List<BankaCalisanlari> getAll(){
        return this.iBankaCalisanlariService.getAll();
    }

    @GetMapping("/getById/{id}")
    BankaCalisanlari getById(@PathVariable int id){
        return this.iBankaCalisanlariService.getById(id);
    }

    @PostMapping("/add")
    void add(@RequestBody BankaCalisanlari bankaCalisani){
        this.iBankaCalisanlariService.add(bankaCalisani);
    }

    @PostMapping("/update")
    void update(@RequestBody BankaCalisanlari bankaCalisani){
        this.iBankaCalisanlariService.update(bankaCalisani);
    }

    @PostMapping("/delete")
    void delete(@RequestBody BankaCalisanlari bankaCalisani){
        this.iBankaCalisanlariService.delete(bankaCalisani);
    }
}
