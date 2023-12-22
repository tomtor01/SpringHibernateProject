package com.example.SpringHibernateProject.controller;

import com.example.SpringHibernateProject.persistence.Klienci;
import com.example.SpringHibernateProject.service.KlienciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
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
    public ResponseEntity<Klienci> saveKlient(@RequestBody Klienci klient) {
        Klienci savedKlient = this.service.saveKlient(klient);
        return new ResponseEntity<>(savedKlient, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Klienci> updateKlient(@PathVariable Long id, @RequestBody Klienci klient) {
        Klienci updatedKlient = this.service.updateKlient(id, klient);
        if (updatedKlient != null) {
            return new ResponseEntity<>(updatedKlient, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteKlient(@PathVariable Long id) {
        this.service.deleteKlient(id);
    }

    @GetMapping("/byImie/{imie}")
    public ResponseEntity<List<Klienci>> getKlienciByImie(@PathVariable String imie) {
        List<Klienci> klienci = this.service.getKlienciByImie(imie);
        return new ResponseEntity<>(klienci, HttpStatus.OK);
    }

    @GetMapping("/miasto/{nazwisko}")
    public ResponseEntity<String> getMiastoByNazwisko(@PathVariable String nazwisko) {
        String miasto = this.service.getMiastoByNazwisko(nazwisko);
        return new ResponseEntity<>(miasto, HttpStatus.OK);
    }

    @GetMapping("/totalSpentByKlientId/{klientId}")
    public ResponseEntity<BigDecimal> getTotalSpentByKlientId(@PathVariable Long klientId) {
        BigDecimal totalSpent = this.service.getTotalSpentByKlientId(klientId);
        return new ResponseEntity<>(totalSpent, HttpStatus.OK);
    }

    @GetMapping("/pageable")
    public ResponseEntity<Page<Klienci>> getAllPage(Pageable pageable) {
        Page<Klienci> result = service.getAllPage(pageable);
        return ResponseEntity.ok(result);
    }
}
