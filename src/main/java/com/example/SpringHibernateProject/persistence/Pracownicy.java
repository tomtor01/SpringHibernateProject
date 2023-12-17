package com.example.SpringHibernateProject.persistence;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Pracownicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Imie;
}
