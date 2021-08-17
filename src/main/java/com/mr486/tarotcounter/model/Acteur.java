package com.mr486.tarotcounter.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Acteur {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;
  private String nom;
  private String photoFile = "default";

  public Acteur(String nom){
    this.nom = nom;
  }

}
