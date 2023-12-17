package com.example.SpringHibernateProject.service;

import com.example.SpringHibernateProject.persistence.Adresy;
import com.example.SpringHibernateProject.repositories.AdresyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdresyService {
    private final AdresyRepository adresyRepository;

    @Autowired
    public AdresyService(AdresyRepository adresRepository) {
        this.adresyRepository = adresRepository;
    }

    public Adresy getAdresByKlientId(Long klientId) {
        return adresyRepository.findById(klientId).orElse(null);
    }

    public Adresy saveAdres(Adresy adres) {
        return adresyRepository.save(adres);
    }
}
