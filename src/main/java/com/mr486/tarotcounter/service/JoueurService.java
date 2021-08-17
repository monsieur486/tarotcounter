package com.mr486.tarotcounter.service;

import com.mr486.tarotcounter.exeption.ResourceNotFoundException;
import com.mr486.tarotcounter.model.Joueur;
import com.mr486.tarotcounter.repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoueurService {

  @Autowired
  private JoueurRepository joueurRepository;

  private ActeurService acteurService;

  public Joueur findById(Long id) throws ResourceNotFoundException {
    Joueur Joueur = joueurRepository.findById(id).orElse(null);
    if (Joueur==null) {
      throw new ResourceNotFoundException("Joueur introuvable avec id: " + id);
    }
    else return Joueur;

  }

}
