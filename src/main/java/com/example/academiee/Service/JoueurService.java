package com.example.academiee.Service;


import com.example.academiee.Entities.*;
import com.example.academiee.Repository.EquipeRepository;
import com.example.academiee.Repository.JoueurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class JoueurService implements IJoueurService {


    JoueurRepository joueurRepository;
    EquipeRepository equipeRepository;


    @Override
    public List<Joueur> getJoueurs() {
        return joueurRepository.findAll();
    }

    @Override
    public Joueur getJoueurById(long id) {
        return joueurRepository.findById(id).get();
    }

    @Override
    public Joueur saveJoueur(Joueur joueur) {

        return joueurRepository.save(joueur);
    }

    @Override
    public List<Joueur> saveJoueurs(List<Joueur> joueurs) {
        return joueurRepository.saveAll(joueurs);
    }

    @Override
    public String deleteJoueur(Long idJoueur) {

        joueurRepository.deleteById(idJoueur);
        return "Joueur supprimé !" + idJoueur;
    }

    @Override
    public Joueur updateJoueur(Long id, Joueur joueur) {
        if (joueurRepository.findById(id).isPresent()) {
            Joueur toUpdateJoueur = joueurRepository.findById(id).get();
            toUpdateJoueur.setNom(joueur.getNom());
            toUpdateJoueur.setPrenom(joueur.getPrenom());
            toUpdateJoueur.setAdresse(joueur.getAdresse());
            return joueurRepository.save(toUpdateJoueur);
        }
        return null;
    }


}




