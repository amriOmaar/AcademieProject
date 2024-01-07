package com.example.academiee.Service;



import com.example.academiee.Entities.Equipe;
import com.example.academiee.Entities.Joueur;

import java.util.List;

public interface IEquipeService {

    public List<Equipe> getEquipes();

    public Equipe saveEquipe(Equipe equipe);
    public List<Equipe> saveEquipes(List<Equipe> equipes);

    public String deleteEquipe(Long idEquipe);


    public Equipe updateEquipe(Long id, Equipe equipe);


}
