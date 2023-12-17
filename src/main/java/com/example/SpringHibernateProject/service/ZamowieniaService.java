package com.example.SpringHibernateProject.service;

import com.example.SpringHibernateProject.persistence.Zamowienia;
import com.example.SpringHibernateProject.repositories.ZamowieniaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZamowieniaService {
    private final ZamowieniaRepository zamowieniaRepository;

    @Autowired
    public ZamowieniaService(ZamowieniaRepository zamowieniaRepository) {
        this.zamowieniaRepository = zamowieniaRepository;
    }

    public List<Zamowienia> getAllZamowienia() {
        return zamowieniaRepository.findAll();
    }

    public Zamowienia getZamowienieById(Long id) {
        return zamowieniaRepository.findById(id).orElse(null);
    }

    public Zamowienia saveZamowienie(Zamowienia zamowienia) {
        return zamowieniaRepository.save(zamowienia);
    }

    public void deleteZamowienie(Long id) {
        zamowieniaRepository.deleteById(id);
    }
}
