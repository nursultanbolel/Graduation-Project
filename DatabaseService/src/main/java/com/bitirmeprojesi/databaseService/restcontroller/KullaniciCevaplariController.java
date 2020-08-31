package com.bitirmeprojesi.databaseService.restcontroller;

import com.bitirmeprojesi.databaseService.business.kullaniciCevaplari.IKullaniciCevaplariService;
import com.bitirmeprojesi.databaseService.entities.KullaniciCevaplari;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/kullaniciCevaplari")
public class KullaniciCevaplariController {

    private IKullaniciCevaplariService iKullaniciCevaplariService;

    @Autowired
    public KullaniciCevaplariController(IKullaniciCevaplariService iKullaniciCevaplariService) {
        this.iKullaniciCevaplariService = iKullaniciCevaplariService;
    }

    @GetMapping("/getAll")
    List<KullaniciCevaplari> getAll(){
        return this.iKullaniciCevaplariService.getAll();
    }

    @GetMapping("/getBySikayetId/{sikayetId}")
    List<KullaniciCevaplari> getBySikayetId(@PathVariable int sikayetId){
        return this.iKullaniciCevaplariService.getBySikayetId(sikayetId);
    }

    @GetMapping("/getById/{id}")
    KullaniciCevaplari getById(@PathVariable int id){
        return this.iKullaniciCevaplariService.getById(id);
    }

    @PostMapping("/add")
    void add(@RequestBody KullaniciCevaplari kullaniciCevabi){
        this.iKullaniciCevaplariService.add(kullaniciCevabi);
    }

    @PostMapping("/update")
    void update(@RequestBody KullaniciCevaplari kullaniciCevabi){
        this.iKullaniciCevaplariService.update(kullaniciCevabi);
    }

    @PostMapping("/delete")
    void delete(@RequestBody KullaniciCevaplari kullaniciCevabi){
        this.iKullaniciCevaplariService.delete(kullaniciCevabi);
    }

}
