package com.example.SpringHibernateProject.repositories;

import com.example.SpringHibernateProject.persistence.Klienci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlienciRepository extends JpaRepository<Klienci, Long> {
}
