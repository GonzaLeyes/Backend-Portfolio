/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.portfolioGLSP.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author gonza
 */
public class dtoProyecto {
    
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String enlaceP;

    public dtoProyecto() {
    }
    
    

    public dtoProyecto(String nombreP, String descripcionP, String enlaceP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.enlaceP = enlaceP;
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
