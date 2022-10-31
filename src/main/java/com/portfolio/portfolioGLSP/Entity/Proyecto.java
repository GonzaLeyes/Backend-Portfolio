/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.portfolioGLSP.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author gonza
 */
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreP;
    private String descripcionP;
    private String enlaceP;

    public Proyecto() {
    }

    public Proyecto(String nombreP, String descripcionP, String enlaceP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.enlaceP = enlaceP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getEnlaceP() {
        return enlaceP;
    }

    public void setEnlaceP(String enlaceP) {
        this.enlaceP = enlaceP;
    }
    
    
    
}
