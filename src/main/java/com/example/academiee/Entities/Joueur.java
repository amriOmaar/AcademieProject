package com.example.academiee.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Entity
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Joueur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String prenom;
    private String nom;
    private int age;
    private String adresse;


    @ManyToOne
    @JsonIgnore
    private Equipe equipe;

    @ManyToOne
    @JsonIgnore
    private Parent parent;


}
