package org.example.jaxrs.repository;

import org.example.jaxrs.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}
