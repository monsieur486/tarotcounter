package com.mr486.tarotcounter.controller;

import com.mr486.tarotcounter.model.Competition;
import com.mr486.tarotcounter.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompetitionControllerApi {
  @Autowired
  private CompetitionService competitionService;

  @GetMapping("/api")
  public List<Competition> competitionList() {
    return competitionService.getCompetitionTop10();
  }

  @GetMapping("/api/competitions")
  public List<Competition> competitionHistoriqueList() {
    return competitionService.getCompetitionHistorique();
  }

  @GetMapping("/api/competitions/{id}")
  public Competition competitionDetail(@PathVariable("id") Long id) {
    return competitionService.findById(id);
  }

  @GetMapping("/api/active/{id}")
  public Competition competitionActive(@PathVariable("id") Long id) {
    return competitionService.findById(id);
  }

}
