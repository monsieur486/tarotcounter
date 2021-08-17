package com.mr486.tarotcounter.repository;

import com.mr486.tarotcounter.model.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoueurRepository extends JpaRepository<Joueur, Long> {
}
