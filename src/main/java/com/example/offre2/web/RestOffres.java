package com.example.offre2.web;

import com.example.offre2.entities.Offre;
import com.example.offre2.repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Offres")
public class RestOffres {
    @Autowired
    OffreRepository offreRepository;
    @GetMapping
    public List<Offre> getAll() {
        return offreRepository.findAll();
    }
    @GetMapping("/{uid}")
    public Offre getbyid(@PathVariable Long uid ) {

        return offreRepository.findById(uid).get();
    }

    @PostMapping
    public Offre saveoffre(@RequestBody Offre newoffre) {
        return offreRepository.save(newoffre);
    }

    @DeleteMapping("/{id}")
    public void deleteoffre(@PathVariable Long id) {
        offreRepository.deleteById(id);
    }


}
