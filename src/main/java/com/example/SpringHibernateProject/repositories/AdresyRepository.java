package com.example.SpringHibernateProject.repositories;

import com.example.SpringHibernateProject.persistence.Adresy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresyRepository extends JpaRepository<Adresy, Long> {
}
