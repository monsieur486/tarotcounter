package com.mr486.tarotcounter.service;

import com.mr486.tarotcounter.exeption.ResourceNotFoundException;
import com.mr486.tarotcounter.model.Acteur;
import com.mr486.tarotcounter.repository.ActeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActeurService {

  @Autowired
  private ActeurRepository acteurRepository;

  public Acteur findById(Long id) throws ResourceNotFoundException {
    Acteur acteur = acteurRepository.findById(id).orElse(null);
    if (acteur==null) {
      throw new ResourceNotFoundException("Acteur introuvable avec id: " + id);
    }
    else return acteur;

  }

    public String getNomById(Long id) throws ResourceNotFoundException {
      Acteur acteur = acteurRepository.findById(id).orElse(null);
      if (acteur==null) {
        throw new ResourceNotFoundException("Acteur introuvable avec id: " + id);
      }
      else return acteur.getNom();
  }

}
