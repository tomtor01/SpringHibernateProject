package com.example.SpringHibernateProject.repositories;

import com.example.SpringHibernateProject.persistence.Zamowienia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZamowieniaRepository extends JpaRepository<Zamowienia, Long> {
}
