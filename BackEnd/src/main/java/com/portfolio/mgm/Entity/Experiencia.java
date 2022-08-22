
package com.portfolio.mgm.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descriptcionE;

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descriptcionE) {
        this.nombreE = nombreE;
        this.descriptcionE = descriptcionE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescriptcionE() {
        return descriptcionE;
    }

    public void setDescriptcionE(String descriptcionE) {
        this.descriptcionE = descriptcionE;
    }
    
    
}
