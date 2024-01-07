package com.example.academiee.Entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

import lombok.*;


@Getter
@Setter
@Entity
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Equipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomEquipe;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "equipe")
    private Set<Joueur> joueurs;




}
