package com.mr486.tarotcounter.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Joueur {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;

  @ManyToOne
  private Acteur acteur;

  private Integer points = 0;
  private Double dette = 0.0;
  private Boolean isGuest = false;

  public String presentation(){
    StringBuilder sb = new StringBuilder(this.acteur.getNom());
    if(isGuest){
      sb.append("*");
    }
    return sb.toString();
  }
}
