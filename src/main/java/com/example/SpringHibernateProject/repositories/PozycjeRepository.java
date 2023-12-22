package com.example.SpringHibernateProject.repositories;

import com.example.SpringHibernateProject.persistence.Pozycje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PozycjeRepository extends JpaRepository<Pozycje, Long> {
}

