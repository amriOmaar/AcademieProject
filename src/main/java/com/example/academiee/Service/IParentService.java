package com.example.academiee.Service;

import com.example.academiee.Entities.Joueur;
import com.example.academiee.Entities.Parent;

import java.util.List;

public interface IParentService {

    public List<Parent> getParents();
    public Parent getParentById(long id);



    public Parent saveParent(Parent parent);
    public List<Parent> saveParents(List<Parent> parents);

    public String deleteParent(Long idParent);
    public Parent updateParent(Long id, Parent parent);


}
