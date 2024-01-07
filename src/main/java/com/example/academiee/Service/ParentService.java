package com.example.academiee.Service;


import com.example.academiee.Entities.*;
import com.example.academiee.Repository.ParentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class ParentService implements IParentService {

    ParentRepository parentRepository;


    @Override
    public List<Parent> getParents() {
        return parentRepository.findAll();
    }

    @Override
    public Parent getParentById(long id) {
        return parentRepository.findById(id).get();
    }

    @Override
    public Parent saveParent(Parent parent) {
        return parentRepository.save(parent);
    }

    @Override
    public List<Parent> saveParents(List<Parent> parents) {
        return parentRepository.saveAll(parents);
    }

    @Override
    public String deleteParent(Long idParent) {
        parentRepository.deleteById(idParent);
        return "Parent supprimé !" + idParent;
    }

    @Override
    public Parent updateParent(Long id, Parent parent) {
        if (parentRepository.findById(id).isPresent()) {
            Parent toUpdateParent = parentRepository.findById(id).get();
            toUpdateParent.setNom(parent.getNom());
            toUpdateParent.setPrenom(parent.getPrenom());
            toUpdateParent.setAdresse(parent.getAdresse());
            return parentRepository.save(toUpdateParent);
        }
        return null;
    }


}




