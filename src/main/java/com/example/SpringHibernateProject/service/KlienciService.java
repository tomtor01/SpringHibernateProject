package com.example.SpringHibernateProject.service;

import com.example.SpringHibernateProject.persistence.Klienci;
import com.example.SpringHibernateProject.repositories.KlienciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class KlienciService {
    KlienciRepository repository;

    @Autowired
    public KlienciService(KlienciRepository repository) {
        this.repository = repository;
    }

    public List<Klienci> getAllKlienci() {
        return this.repository.findAll();
    }

    public Klienci getKlientById(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    public Klienci saveKlient(Klienci klient) {
        klient.setId(null);
        return this.repository.save(klient);
    }
    public Klienci updateKlient(Long id, Klienci klient) {
        Klienci existingKlient = this.repository.findById(id).orElse(null);
        if (existingKlient != null) {
            klient.setId(id);
            return this.repository.save(klient);
        } else {
            return null;
        }
    }

    public void deleteKlient(Long id) {
        this.repository.deleteById(id);
    }

    public List<Klienci> getKlienciByImie(String imie) {
        return this.repository.findByImie(imie);
    }

    public String getMiastoByNazwisko(String nazwisko) {
        return this.repository.findMiastoByNazwisko(nazwisko);
    }

    public BigDecimal getTotalSpentByKlientId(Long klientId) {
        return this.repository.findTotalSpentByKlientId(klientId);
    }

    public Page<Klienci> getAllPage(Pageable pageable) {
        return repository.findPage(pageable);
    }
}
