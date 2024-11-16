package com.upiiz.superheroes.services;

import com.upiiz.superheroes.entities.Heroe;
import com.upiiz.superheroes.repositories.HeroeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroeService {
    @Autowired
    private HeroeRepository heroeRepository;

    // Get all
    public List<Heroe> getAllHeroes(){
        return heroeRepository.findAll();
    }

    // Get one
    public Heroe getHeroeById(Long id){
        return heroeRepository.findById(id).orElse(null);
    }

    // Create
    public Heroe createHeroe(Heroe heroe){
        return heroeRepository.save(heroe);
    }

    // Update
    public Heroe updateHeroe(Heroe heroe){
        return heroeRepository.save(heroe);
    }

    // Delete
    public void deleteHeroe(Long id){
        heroeRepository.deleteById(id);
    }
}
