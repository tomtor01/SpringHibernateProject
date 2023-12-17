package com.example.SpringHibernateProject.repositories;

import com.example.SpringHibernateProject.persistence.Pracownicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracownicyRepository extends JpaRepository<Pracownicy, Long> {
}
