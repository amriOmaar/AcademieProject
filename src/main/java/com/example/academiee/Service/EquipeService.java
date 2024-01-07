package com.example.academiee.Service;

import com.example.academiee.Entities.Equipe;
import com.example.academiee.Entities.Joueur;
import com.example.academiee.Repository.EquipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@AllArgsConstructor
@Service
public class EquipeService implements IEquipeService {


    EquipeRepository equipeRepository;

    @Override
    public List<Equipe> getEquipes(){
        return equipeRepository.findAll();
    }

    @Override
    public Equipe saveEquipe(Equipe equipe){
        return equipeRepository.save(equipe);
    }

    @Override
    public List<Equipe> saveEquipes(List<Equipe> equipes){
        return equipeRepository.saveAll(equipes);
    }


    @Override
    public String deleteEquipe(Long idEquipe){
        equipeRepository.deleteById(idEquipe);
        return "Equipe supprimé !" +idEquipe;
    }

    @Override
    public Equipe updateEquipe(Long id, Equipe equipe) {
        if (equipeRepository.findById(id).isPresent()) {
            Equipe toUpdateEquipe = equipeRepository.findById(id).get();
            toUpdateEquipe.setNomEquipe(equipe.getNomEquipe());
            return equipeRepository.save(toUpdateEquipe);
        }
        return null;
    }

}
