/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.coordinador;

import model.Persona;

import java.util.ArrayList;

/**
 *
 * @author INGESIS
 */
public abstract class Coordinador extends Persona {

    /*Atributos*/
    private int codigoCoordinador;
    private ArrayList<TareasEnum> tareas = new ArrayList<>();

    /*Constructor*/
    public Coordinador(){
        
    }
    /*Contructor*/
    public Coordinador(int identificacion, String nombre, String direccion, int codigoCoordinador) {
        super(identificacion, nombre, direccion);
        this.codigoCoordinador = codigoCoordinador;
    }
    /*Getters and Setters*/
    public int getCodigoCoordinador() {
        return codigoCoordinador;
    }
    public void setCodigoCoordinador(int codigoCoordinador) {
        this.codigoCoordinador = codigoCoordinador;
    }
    public ArrayList<TareasEnum> getTareas() {
        return tareas;
    }
    public void setTareas(ArrayList<TareasEnum> tareas) {
        this.tareas = tareas;
    }

    /*Polimorfismo*/
    public abstract String descripcionCoordinador();
}
