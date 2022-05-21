/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.medico;

import model.nivel.Nivel;
import model.Persona;


public abstract class Medico extends Persona {

    /*Atributos*/
    private int codigoMedico;
    private Nivel nivel;

    /*Constructores*/
    public Medico() {
    }

    public Medico(int identificacion, String nombre, String direccion, int codigoMedico, Nivel nivel) {
        super(identificacion, nombre, direccion);
        this.nivel = nivel;
        this.codigoMedico = codigoMedico;
    }

    /*Getters and Setters*/

    public int getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigoMedico(int codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    /*Mètodos(Polimorfismo)*/
    public abstract String descripcionMedico();

}
