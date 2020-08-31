package com.bitirmeprojesi.databaseService.restcontroller;

import com.bitirmeprojesi.databaseService.business.bankaCalisanlariCevaplari.IBankaCalisanlariCevaplariService;
import com.bitirmeprojesi.databaseService.entities.BankaCalisanlariCevaplari;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/bankaCalisanlariCevaplari")
public class BankaCalisanlariCevaplariController {

    private IBankaCalisanlariCevaplariService iBankaCalisanlariCevaplariService;

    @Autowired
    public BankaCalisanlariCevaplariController(IBankaCalisanlariCevaplariService iBankaCalisanlariCevaplariService) {
        this.iBankaCalisanlariCevaplariService = iBankaCalisanlariCevaplariService;
    }

    @GetMapping("/getAll")
    List<BankaCalisanlariCevaplari> getAll(){
        return this.iBankaCalisanlariCevaplariService.getAll();
    }

    @GetMapping("/getBySikayetId/{sikayetId}")
    List<BankaCalisanlariCevaplari> getBySikayetId(@PathVariable int sikayetId){
        return this.iBankaCalisanlariCevaplariService.getBySikayetId(sikayetId);
    }

    @GetMapping("/getById/{id}")
    BankaCalisanlariCevaplari getById(@PathVariable int id){
        return this.iBankaCalisanlariCevaplariService.getById(id);
    }

    @PostMapping("/add")
    void add(@RequestBody BankaCalisanlariCevaplari bankaCalisanlariCevabi){
        this.iBankaCalisanlariCevaplariService.add(bankaCalisanlariCevabi);
    }

    @PostMapping("/update")
    void update(@RequestBody BankaCalisanlariCevaplari bankaCalisanlariCevabi){
        this.iBankaCalisanlariCevaplariService.update(bankaCalisanlariCevabi);
    }

    @PostMapping("/delete")
    void delete(@RequestBody BankaCalisanlariCevaplari bankaCalisanlariCevabi){
        this.iBankaCalisanlariCevaplariService.delete(bankaCalisanlariCevabi);
    }

}
