package com.example.academiee.Controller;


import com.example.academiee.Entities.*;
import com.example.academiee.Service.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
public class EquipeController {


    EquipeService equipeService;


    @GetMapping("/allEquipes")
    private List<Equipe> getAllEquipes() {
        return equipeService.getEquipes();
    }


    @PostMapping("/addEquipe")
    public Equipe saveEquipe (@RequestBody Equipe equipe){
        return equipeService.saveEquipe(equipe);
    }


    @PostMapping("/addEquipes")
    public List<Equipe> addEquipes (@RequestBody List<Equipe> equipes){
        return equipeService.saveEquipes(equipes);
    }


    @PutMapping("/updateEquipe/{id}")
    Equipe updateEquipe(@PathVariable("id") Long id, @RequestBody Equipe equipe){
        return equipeService.updateEquipe(id, equipe);
    }
    @DeleteMapping("/deleteEquipe/{idEquipe}")
    public String deleteEquipe (@PathVariable Long idEquipe){
        return equipeService.deleteEquipe(idEquipe);
    }





}
