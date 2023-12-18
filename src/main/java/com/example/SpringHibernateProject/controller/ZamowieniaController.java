package com.example.SpringHibernateProject.controller;

import com.example.SpringHibernateProject.persistence.Zamowienia;
import com.example.SpringHibernateProject.service.ZamowieniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/zamowienia")
public class ZamowieniaController {
    private final ZamowieniaService zamowieniaService;

    @Autowired
    public ZamowieniaController(ZamowieniaService zamowieniaService) {
        this.zamowieniaService = zamowieniaService;
    }

    @GetMapping
    public List<Zamowienia> getAllZamowienia() {
        return zamowieniaService.getAllZamowienia();
    }

    @GetMapping("/{id}")
    public Zamowienia getZamowienieById(@PathVariable Long id) {
        return zamowieniaService.getZamowienieById(id);
    }

    @PostMapping
    public Zamowienia saveZamowienie(@RequestBody Zamowienia zamowienie) {
        return zamowieniaService.saveZamowienie(zamowienie);
    }

    @DeleteMapping("/{id}")
    public void deleteZamowienie(@PathVariable Long id) {
        zamowieniaService.deleteZamowienie(id);
    }
}
