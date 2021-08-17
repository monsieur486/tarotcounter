package com.mr486.tarotcounter.service;

import com.mr486.tarotcounter.exeption.ResourceNotFoundException;
import com.mr486.tarotcounter.model.Competition;
import com.mr486.tarotcounter.repository.CompetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitionService {

  @Autowired
  private CompetitionRepository competitionRepository;

  public Competition findById(Long id) throws ResourceNotFoundException {
    Competition competition = competitionRepository.findById(id).orElse(null);
    if (competition==null) {
      throw new ResourceNotFoundException("Compétition introuvable avec id: " + id);
    }
    else return competition;
  }

  public List<Competition> getCompetitionTop10()  {
    return competitionRepository.findTop10ByOrderByCompetitionDateDesc();
  }

  public List<Competition> getCompetitionHistorique()  {
    return competitionRepository.findAllByOrderByCompetitionDateDesc();
  }

}
