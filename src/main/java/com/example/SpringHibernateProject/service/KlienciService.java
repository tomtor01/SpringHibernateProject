package com.example.SpringHibernateProject.service;

import com.example.SpringHibernateProject.persistence.Klienci;
import com.example.SpringHibernateProject.repositories.KlienciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return this.repository.save(klient);
    }

    public void deleteKlient(Long id) {
        this.repository.deleteById(id);
    }
}
