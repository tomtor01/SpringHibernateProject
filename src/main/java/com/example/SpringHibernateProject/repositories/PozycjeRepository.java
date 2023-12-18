package com.example.SpringHibernateProject.repositories;

import com.example.SpringHibernateProject.persistence.Pozycje;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PozycjeRepository extends JpaRepository<Pozycje, Long> {
}

