package com.upiiz.superheroes.controllers;

import com.upiiz.superheroes.entities.Heroe;
import com.upiiz.superheroes.services.HeroeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/superheroes")
public class HeroeController {
    @Autowired
    HeroeService heroeService;

    // Get all
    @GetMapping
    public ResponseEntity<List<Heroe>> getHeroes(){
        return ResponseEntity.ok(heroeService.getAllHeroes());
    }

    // Get one
    @GetMapping("/{id}")
    public ResponseEntity<Heroe> getHeroeById(@PathVariable Long id){
        return ResponseEntity.ok(heroeService.getHeroeById(id));
    }

    // Create
    @PostMapping
    public ResponseEntity<Heroe> createHeroe(@RequestBody Heroe heroe){
        return ResponseEntity.ok(heroeService.createHeroe(heroe));
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<Heroe> updateHeroe(@RequestBody Heroe heroe, @PathVariable Long id){
        return ResponseEntity.ok(heroeService.updateHeroe(heroe));
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHeroe(@PathVariable Long id){
        heroeService.deleteHeroe(id);
        return ResponseEntity.noContent().build();
    }



}
