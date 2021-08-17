package com.mr486.tarotcounter.controller;

import com.mr486.tarotcounter.model.Competition;
import com.mr486.tarotcounter.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CompetitionController {
  @Autowired
  private CompetitionService competitionService;

  @GetMapping("/")
  public String competitionList(Model model) {
    model.addAttribute("competitions", competitionService.getCompetitionTop10());
    return "index";
  }

  @GetMapping("/competitions")
  public String competitionHistoriqueList(Model model) {
    model.addAttribute("competitions", competitionService.getCompetitionHistorique());
    return "historiqueCompetitions";
  }

  @GetMapping("/competitions/{id}")
  public String competitionDetail(@PathVariable("id") Long id, Model model) {
    Competition maCompet = competitionService.findById(id);
    model.addAttribute("competition", maCompet);

    return "detailCompetition";
  }

  @GetMapping("/active/{id}")
  public String competitionActive(@PathVariable("id") Long id, Model model) {
    Competition maCompet = competitionService.findById(id);
    model.addAttribute("competition", maCompet);

    return "competitionActive";
  }

}
