package com.example.academiee.Service;



import com.example.academiee.Entities.Joueur;

import java.util.List;

public interface IJoueurService {

    public List<Joueur> getJoueurs();
    public Joueur getJoueurById(long id);



    public Joueur saveJoueur(Joueur joueur);
    public List<Joueur> saveJoueurs(List<Joueur> joueurs);

    public String deleteJoueur(Long idJoueur);
    public Joueur updateJoueur(Long id, Joueur joueur);


    public Joueur ajouterJoueurEtAffecterAEquipe (Joueur joueur, Long idEquipe);

    public Joueur ajouterJoueurEtAffecterAParent (Joueur joueur, Long idParent);

    public Joueur ajouterJoueurEtAffecterAParentAndEquipe (Joueur joueur, Long idParent, Long idEquipe);


}
