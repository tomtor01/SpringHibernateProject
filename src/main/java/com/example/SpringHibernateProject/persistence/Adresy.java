package com.example.SpringHibernateProject.persistence;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "Adresy")
public class Adresy {
    @Id
    @Column(name = "KlientID")
    private Long klientID;
    @Column(name = "Ulica")
    private String ulica;
    @Column(name = "Miasto")
    private String miasto;
    @Column(name = "KodPocztowy")
    private String kodPocztowy;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "klientID")
    @ToString.Exclude
    private Klienci klient;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Adresy adresy = (Adresy) o;
        return getKlientID() != null && Objects.equals(getKlientID(), adresy.getKlientID());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
