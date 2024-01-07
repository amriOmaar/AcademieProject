package com.example.academiee.Repository;


import com.example.academiee.Entities.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface JoueurRepository extends JpaRepository<Joueur,Long>
{


}
