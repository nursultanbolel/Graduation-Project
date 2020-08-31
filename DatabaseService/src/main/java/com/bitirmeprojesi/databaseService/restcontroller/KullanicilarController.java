package com.bitirmeprojesi.databaseService.restcontroller;

import com.bitirmeprojesi.databaseService.business.kullanicilar.IKullanicilarService;
import com.bitirmeprojesi.databaseService.entities.Kullanicilar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kullanicilar")
public class KullanicilarController {

    private IKullanicilarService iKullanicilarService;

    @Autowired
    public KullanicilarController(IKullanicilarService iKullanicilarService) {
        this.iKullanicilarService = iKullanicilarService;
    }

    @GetMapping("/getAll")
    List<Kullanicilar> getAll(){
        return this.iKullanicilarService.getAll();
    }

    @GetMapping("/getById/{id}")
    Kullanicilar getById(@PathVariable int id){
        return this.iKullanicilarService.getById(id);
    }

    @PostMapping("/add")
    void add(@RequestBody Kullanicilar kullanici){
        this.iKullanicilarService.add(kullanici);
    }

    @PostMapping("/update")
    void update(@RequestBody Kullanicilar kullanici){
        this.iKullanicilarService.update(kullanici);
    }

    @PostMapping("/delete")
    void delete(@RequestBody Kullanicilar kullanici){
        this.iKullanicilarService.delete(kullanici);
    }
}
