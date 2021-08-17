package com.mr486.tarotcounter.repository;

import com.mr486.tarotcounter.model.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompetitionRepository extends JpaRepository<Competition, Long> {
  List<Competition> findTop10ByOrderByCompetitionDateDesc();
  List<Competition> findAllByOrderByCompetitionDateDesc();
  List<Competition> findCompetitionByIsActive(Boolean isActive);
}
