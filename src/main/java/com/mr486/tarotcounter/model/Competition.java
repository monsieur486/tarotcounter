package com.mr486.tarotcounter.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Competition {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;

  @Temporal(TemporalType.DATE)
  private Date competitionDate;

  private Boolean isActive;

  @ManyToOne
  private Joueur joueur1;
  @ManyToOne
  private Joueur joueur2;
  @ManyToOne
  private Joueur joueur3;
  @ManyToOne
  private Joueur joueur4;
  @ManyToOne
  private Joueur joueur5;

  public Competition(){
    this.competitionDate = new Date();
    this.isActive = true;
  }

  public Boolean isCinqsJoueurs(){
    return joueur5 != null;
  }

}
