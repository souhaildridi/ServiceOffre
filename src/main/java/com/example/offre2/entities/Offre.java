package com.example.offre2.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "offres") // Optional: Specify the table name
public class Offre {
    @Id
    @GeneratedValue
    private long code;

    @Column(name = "intitule") // Explicit column mapping
    private String intitulé;

    @Column(name = "specialite") // Explicit column mapping
    private String specialité;

    @Column(name = "societe") // Explicit column mapping
    private String société;

    @Column(name = "nbpostes") // Explicit column mapping
    private int nbpostes;

    @Column(name = "pays") // Explicit column mapping
    private String pays;
    public Offre(long code, String intitulé, String specialité, String société, int nbpostes, String pays) {
        super();
        this.code = code;
        this.intitulé = intitulé;
        this.specialité = specialité;
        this.société = société;
        this.nbpostes = nbpostes;
        this.pays = pays;
    }
    public Offre() {
        super();
    }
    public long getCode() {
        return code;
    }
    public void setCode(long code) {
        this.code = code;
    }
    public String getIntitulé() {
        return intitulé;
    }
    public void setIntitulé(String intitulé) {
        this.intitulé = intitulé;
    }
    public String getSpecialité() {
        return specialité;
    }
    public void setSpecialité(String specialité) {
        this.specialité = specialité;
    }
    public String getSociété() {
        return société;
    }
    public void setSociété(String société) {
        this.société = société;
    }
    public int getNbpostes() {
        return nbpostes;
    }
    public void setNbpostes(int nbpostes) {
        this.nbpostes = nbpostes;
    }
    public String getPays() {
        return pays;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }



}

