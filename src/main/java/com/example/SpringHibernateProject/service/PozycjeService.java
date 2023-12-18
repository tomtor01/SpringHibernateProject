package com.example.SpringHibernateProject.service;

import com.example.SpringHibernateProject.persistence.Pozycje;
import com.example.SpringHibernateProject.repositories.PozycjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.*;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
