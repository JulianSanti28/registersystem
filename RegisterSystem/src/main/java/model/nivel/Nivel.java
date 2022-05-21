/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.nivel;

import model.SeccionEnum;


public abstract class Nivel {

    /*Atributos*/
    private int codigoNivel;
    private String nombreNivel;
    private String descripcionaNivel;
    private SeccionEnum seccionEnum;
    
    /*Constructores*/
    public Nivel(int codigoNivel, String nombreNivel, String descripcionaNivel, SeccionEnum seccion) {
        this.codigoNivel = codigoNivel;
        this.nombreNivel = nombreNivel;
        this.descripcionaNivel = descripcionaNivel;
        this.seccionEnum = seccion;
    }
    public Nivel(){
        
    }
    /*Getters and Setters(Encapsulamiento)*/
    public int getCodigoNivel() {
        return codigoNivel;
    }

    public SeccionEnum getSeccionEnum() {
        return seccionEnum;
    }

    public void setSeccionEnum(SeccionEnum seccionEnum) {
        this.seccionEnum = seccionEnum;
    }

    public void setCodigoNivel(int codigoNivel) {
        this.codigoNivel = codigoNivel;
    }

    public String getNombreNivel() {
        return nombreNivel;
    }

    public void setNombreNivel(String nombreNivel) {
        this.nombreNivel = nombreNivel;
    }

    public String getDescripcionaNivel() {
        return descripcionaNivel;
    }

    public void setDescripcionaNivel(String descripcionaNivel) {
        this.descripcionaNivel = descripcionaNivel;
    }
    
    /*Mètodos(Polimorfismo)*/
    public abstract void descripcionNivel();
}
