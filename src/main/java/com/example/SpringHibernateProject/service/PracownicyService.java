package com.example.SpringHibernateProject.service;

import com.example.SpringHibernateProject.persistence.Pracownicy;
import com.example.SpringHibernateProject.repositories.PracownicyRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class PracownicyService {

    PracownicyRepository repository;

    public PracownicyService(PracownicyRepository repository) {
        this.repository = repository;
    }

    public List<Pracownicy> getAll() {
        return this.repository.findAll();
    }

    public Pracownicy getById(Long id) {
        return this.repository.findById(id).get();
    }

    public Pracownicy add(Pracownicy pracownicy) {
        return this.repository.save(pracownicy);
    }

//    public Pracownicy update(Long id, Pracownicy pracownicy) {
//        Optional<Pracownicy> dept = this.repository.findById(id);
//    }

}
