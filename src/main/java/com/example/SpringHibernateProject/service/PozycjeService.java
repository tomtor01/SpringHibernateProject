package com.example.SpringHibernateProject.service;

import com.example.SpringHibernateProject.persistence.Pozycje;
import com.example.SpringHibernateProject.repositories.PozycjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PozycjeService {
    private final PozycjeRepository pozycjeRepository;

    @Autowired
    public PozycjeService(PozycjeRepository pozycjaZamowieniaRepository) {
        this.pozycjeRepository = pozycjaZamowieniaRepository;
    }

    public List<Pozycje> getAllPozycjeZamowienia() {
        return pozycjeRepository.findAll();
    }

    public Pozycje getPozycjaZamowieniaById(Long id) {
        return pozycjeRepository.findById(id).orElse(null);
    }

    public Pozycje savePozycjaZamowienia(Pozycje pozycjaZamowienia) {
        return pozycjeRepository.save(pozycjaZamowienia);
    }

    public void deletePozycjaZamowienia(Long id) {
        pozycjeRepository.deleteById(id);
    }
}
