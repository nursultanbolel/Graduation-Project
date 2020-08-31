package com.bitirmeprojesi.databaseService.restcontroller;

import com.bitirmeprojesi.databaseService.business.bankalar.IBankalarService;
import com.bitirmeprojesi.databaseService.entities.Bankalar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/bankalar")
public class BankalarController {

    private IBankalarService iBankalarService;

    @Autowired
    public BankalarController(IBankalarService iBankalarService) {
        this.iBankalarService = iBankalarService;
    }

    @GetMapping("/getAll")
    @CrossOrigin(origins = "http://localhost:4200")
    List<Bankalar> getAll(){
        return this.iBankalarService.getAll();
    }

    @GetMapping("/getById/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    Bankalar getById(@PathVariable int id){
        return this.iBankalarService.getById(id);
    }

    @PostMapping("/add")
    @CrossOrigin(origins = "http://localhost:4200")
    void add(@RequestBody Bankalar banka){
        this.iBankalarService.add(banka);
    }

    @PostMapping("/update")
    @CrossOrigin(origins = "http://localhost:4200")
    void update(@RequestBody Bankalar banka){
        this.iBankalarService.update(banka);
    }

    @PostMapping("/delete")
    @CrossOrigin(origins = "http://localhost:4200")
    void delete(@RequestBody Bankalar banka){
        this.iBankalarService.delete(banka);
    }
}