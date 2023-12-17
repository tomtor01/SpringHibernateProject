package com.example.SpringHibernateProject.controller;

import com.example.SpringHibernateProject.persistence.Pracownicy;
import com.example.SpringHibernateProject.service.PracownicyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PracownicyController {
    PracownicyService service;

    public PracownicyController(PracownicyService service) {
        this.service = service;
    }

    @GetMapping(value = "/pracownicy")
    public List<Pracownicy> getAll(){
        return this.service.getAll();
    }

    @GetMapping(value = "/pracownicy/{id}")
    public Pracownicy getById(@PathVariable Long id) {
        return this.service.getById(id);
    }

    @PostMapping(value = "/pracownicy")
    public Pracownicy add(Pracownicy pracownicy) {
        return this.service.add(pracownicy);
    }
}
