package com.example.SpringHibernateProject.controller;

import com.example.SpringHibernateProject.persistence.Pozycje;
import com.example.SpringHibernateProject.service.PozycjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pozycje")
public class PozycjeController {
    private final PozycjeService pozycjeService;

    @Autowired
    public PozycjeController(PozycjeService pozycjeService) {
        this.pozycjeService = pozycjeService;
    }

    @GetMapping
    public List<Pozycje> getAllPozycjeZamowienia() {
        return pozycjeService.getAllPozycjeZamowienia();
    }

    @GetMapping("/{id}")
    public Pozycje getPozycjaZamowieniaById(@PathVariable Long id) {
        return pozycjeService.getPozycjaZamowieniaById(id);
    }

    @PostMapping
    public Pozycje savePozycjaZamowienia(@RequestBody Pozycje pozycjaZamowienia) {
        return pozycjeService.savePozycjaZamowienia(pozycjaZamowienia);
    }

    @DeleteMapping("/{id}")
    public void deletePozycjaZamowienia(@PathVariable Long id) {
        pozycjeService.deletePozycjaZamowienia(id);
    }
}
