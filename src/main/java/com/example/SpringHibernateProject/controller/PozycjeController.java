package com.example.SpringHibernateProject.controller;

import com.example.SpringHibernateProject.persistence.Pozycje;
import com.example.SpringHibernateProject.service.PozycjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pozycje")
public class PozycjeController {
    PozycjeService service;

    @Autowired
    public PozycjeController(PozycjeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pozycje> getAllPozycjeZamowienia() {
        return this.service.getAllPozycjeZamowienia();
    }

    @GetMapping("/{id}")
    public Pozycje getPozycjaZamowieniaById(@PathVariable Long id) {
        return this.service.getPozycjaZamowieniaById(id);
    }

    @PostMapping
    public Pozycje savePozycjaZamowienia(@RequestBody Pozycje pozycjaZamowienia) {
        return this.service.savePozycjaZamowienia(pozycjaZamowienia);
    }

    @DeleteMapping("/{id}")
    public void deletePozycjaZamowienia(@PathVariable Long id) {
        this.service.deletePozycjaZamowienia(id);
    }
}
