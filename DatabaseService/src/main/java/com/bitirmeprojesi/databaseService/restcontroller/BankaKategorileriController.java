package com.bitirmeprojesi.databaseService.restcontroller;

import com.bitirmeprojesi.databaseService.business.bankaKategorileri.IBankaKategorileriService;
import com.bitirmeprojesi.databaseService.entities.BankaKategorileri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/bankaKategorileri")
public class BankaKategorileriController {

    private IBankaKategorileriService ibankaKategorileriService;

    @Autowired
    public BankaKategorileriController(IBankaKategorileriService bankaKategorileriService) {
        this.ibankaKategorileriService = bankaKategorileriService;
    }

    @GetMapping("/getAll")
    public List<BankaKategorileri> getAll(){
        return this.ibankaKategorileriService.getAll();
    }

    @GetMapping("/getById/{id}")
    public BankaKategorileri getById(@PathVariable int id){
        return this.ibankaKategorileriService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody BankaKategorileri bankaKategorisi){
        this.ibankaKategorileriService.add(bankaKategorisi);
    }

    @PostMapping("/update")
    public void update(@RequestBody BankaKategorileri bankaKategorisi){
        this.ibankaKategorileriService.update(bankaKategorisi);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody  BankaKategorileri bankaKategorisi){
        this.ibankaKategorileriService.delete(bankaKategorisi);
    }
}
