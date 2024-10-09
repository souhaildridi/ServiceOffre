package com.example.offre2;

import com.example.offre2.entities.Offre;
import com.example.offre2.repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Offre2Application implements CommandLineRunner {
    @Autowired
    OffreRepository offreRepository;

    public static void main(String[] args) {
        SpringApplication.run(Offre2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        offreRepository.save(new Offre(1,"Web Design", "informatique", "AXA", 2, "France"));
        offreRepository.save(new Offre(2,"Developpeur", "informatique", "Talys", 3, "Tunisie"));
        offreRepository.save(new Offre(3,"Architecte", "informatique", "SIS", 2, "Allemagne"));
    }
}
