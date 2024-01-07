package com.example.academiee.Controller;


import com.example.academiee.Entities.Parent;
import com.example.academiee.Service.ParentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
public class ParentController {


    ParentService parentService;


    @GetMapping("/allParents")
    private List<Parent> getAllParents() {
        return parentService.getParents();
    }


    @PostMapping("/addParent")
    public Parent saveParent (@RequestBody Parent parent){
        return parentService.saveParent(parent);
    }


    @PostMapping("/addParents")
    public List<Parent> saveParents (@RequestBody List<Parent> parents){
        return parentService.saveParents(parents);
    }


    @PutMapping("/updateParent/{id}")
    Parent updateParent(@PathVariable("id") Long id, @RequestBody Parent parent){
        return parentService.updateParent(id, parent);
    }
    @DeleteMapping("/deleteParent/{idParent}")
    public String deleteParent (@PathVariable Long idParent){
        return parentService.deleteParent(idParent);
    }





}
