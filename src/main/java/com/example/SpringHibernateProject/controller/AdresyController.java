package com.example.SpringHibernateProject.controller;

import com.example.SpringHibernateProject.persistence.Adresy;
import com.example.SpringHibernateProject.service.AdresyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/adresy")
public class AdresyController {
    private final AdresyService adresyService;

    @Autowired
    public AdresyController(AdresyService adresyService) {
        this.adresyService = adresyService;
    }

    @GetMapping("/klient/{klientId}")
    public Adresy getAdresByKlientId(@PathVariable Long klientId) {
        return adresyService.getAdresByKlientId(klientId);
    }

    @PostMapping
    public Adresy saveAdres(@RequestBody Adresy adres) {
        return adresyService.saveAdres(adres);
    }
}
