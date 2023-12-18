package com.example.SpringHibernateProject.repositories;

import com.example.SpringHibernateProject.persistence.Klienci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.math.BigDecimal;
import java.util.List;

@Repository
public interface KlienciRepository extends JpaRepository<Klienci, Long> {

    @Query(value = "SELECT a.miasto FROM Klienci k JOIN Adresy a ON k.id = a.KlientID WHERE k.nazwisko = :nazwisko", nativeQuery = true)
    String findMiastoByNazwisko(@Param("nazwisko") String nazwisko);


    @Query(value = "SELECT SUM(p.Cena * p.Ilosc) FROM pozycje_zamowienia p " +
            "JOIN Zamowienia z ON p.ZamowienieID = z.ID " +
            "WHERE z.KlientID = :klientId", nativeQuery = true)
    BigDecimal findTotalSpentByKlientId(@Param("klientId") Long klientId);


    @Query("SELECT k FROM Klienci k")
    Page<Klienci> findPage(Pageable pageable);


    List<Klienci> findByImie(String imie);
}
