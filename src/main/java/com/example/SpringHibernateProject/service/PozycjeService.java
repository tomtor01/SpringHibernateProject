package com.example.SpringHibernateProject.service;

import com.example.SpringHibernateProject.persistence.Pozycje;
import com.example.SpringHibernateProject.repositories.PozycjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PozycjeService {
    PozycjeRepository repository;

    @Autowired
    public PozycjeService(PozycjeRepository repository) {
        this.repository = repository;
    }

    public List<Pozycje> getAllPozycjeZamowienia() {
        return this.repository.findAll();
    }

    public Pozycje getPozycjaZamowieniaById(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    public Pozycje savePozycjaZamowienia(Pozycje pozycjaZamowienia) {
        return this.repository.save(pozycjaZamowienia);
    }

    public void deletePozycjaZamowienia(Long id) {
        this.repository.deleteById(id);
    }

}
