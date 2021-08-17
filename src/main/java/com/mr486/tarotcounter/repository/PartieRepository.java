package com.mr486.tarotcounter.repository;

import com.mr486.tarotcounter.model.Partie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartieRepository extends JpaRepository<Partie, Long> {
}
