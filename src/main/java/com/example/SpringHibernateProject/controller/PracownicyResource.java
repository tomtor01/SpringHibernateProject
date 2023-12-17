package com.example.SpringHibernateProject.controller;

import com.example.SpringHibernateProject.service.PracownicyService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracownicyResource {
    PracownicyService service;

    public PracownicyResource(PracownicyService service) {
        this.service = service;
    }
}
