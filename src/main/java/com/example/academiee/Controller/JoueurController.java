package com.example.academiee.Controller;


import com.example.academiee.Entities.*;
import com.example.academiee.Service.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
public class JoueurController {

    IJoueurService joueurService;

    @GetMapping("/joueurs")
    private List<Joueur> getAllJoueurs() {
        return joueurService.getJoueurs();
    }

    @GetMapping("/joueur/{idJoueur}")
    private Joueur getJoueur(@PathVariable("idJoueur") long idJoueur) {
        return joueurService.getJoueurById(idJoueur);
    }

    @PostMapping("/addJoueur")
    public Joueur saveJoueur (@RequestBody Joueur joueur){
        return joueurService.saveJoueur(joueur);
    }

    @PostMapping("/addJoueurs")
    public List<Joueur> saveJoueurs(@RequestBody List<Joueur> Joueur){
        return joueurService.saveJoueurs(Joueur);
    }


    @PutMapping("/updateJoueur/{id}")
    Joueur updateJoueur(@PathVariable("id") Long id, @RequestBody Joueur joueur){
        return joueurService.updateJoueur(id, joueur);
    }

    @DeleteMapping("/deleteJoueur/{idJoueur}")
    public String deleteJoueur (@PathVariable("idJoueur") Long idJoueur){
        return joueurService.deleteJoueur(idJoueur);
    }

}
