package com.example.SpringHibernateProject.controller;

import com.example.SpringHibernateProject.persistence.Klienci;
import com.example.SpringHibernateProject.service.KlienciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/klienci")
public class KlienciController {

    KlienciService service;

    @Autowired
    public KlienciController(KlienciService service) {
        this.service = service;
    }

    @GetMapping
    public List<Klienci> getAllKlienci() {
        return this.service.getAllKlienci();
    }

    @GetMapping("/{id}")
    public Klienci getKlientById(@PathVariable Long id) {
        return this.service.getKlientById(id);
    }

    @PostMapping
    public Klienci saveKlient(@RequestBody Klienci klient) {
        return this.service.saveKlient(klient);
    }

    @DeleteMapping("/{id}")
    public void deleteKlient(@PathVariable Long id) {
        this.service.deleteKlient(id);
    }
}
