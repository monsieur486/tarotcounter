package com.mr486.tarotcounter.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Partie {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;

  @ManyToOne
  private Competition competition;

  private Integer numero;

  @ManyToOne
  private Contrat contrat;
  private Boolean isReussi = true;
  private Integer point;

  @ManyToOne
  private Joueur preneur;

  @ManyToOne
  private Joueur appel;

  @ManyToOne
  private Joueur petitAuBout;

  private Boolean isChelemReussi = false;
}
