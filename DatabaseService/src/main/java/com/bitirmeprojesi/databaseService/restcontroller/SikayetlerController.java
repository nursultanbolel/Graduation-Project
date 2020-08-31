package com.bitirmeprojesi.databaseService.restcontroller;

import com.bitirmeprojesi.databaseService.business.sikayetler.ISikayetlerService;
import com.bitirmeprojesi.databaseService.entities.Sikayetler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sikayetler")
public class SikayetlerController {

    private ISikayetlerService iSikayetlerService;

    @Autowired
    public SikayetlerController(ISikayetlerService iSikayetlerService) {
        this.iSikayetlerService = iSikayetlerService;
    }

    @GetMapping("/getAll")
    List<Sikayetler> getAll(){
        return this.iSikayetlerService.getAll();
    }

    @GetMapping("/getById/{id}")
    Sikayetler getById(@PathVariable int id){
        return this.iSikayetlerService.getById(id);
    }

    @PostMapping("/add")
    void add(@RequestBody Sikayetler sikayet){
        this.iSikayetlerService.add(sikayet);
    }

    @PostMapping("/update")
    void update(@RequestBody Sikayetler sikayet){
        this.iSikayetlerService.update(sikayet);
    }

    @GetMapping("/delete/{id}")
    void delete(@PathVariable int id){
        this.iSikayetlerService.delete(id);
    }
}
