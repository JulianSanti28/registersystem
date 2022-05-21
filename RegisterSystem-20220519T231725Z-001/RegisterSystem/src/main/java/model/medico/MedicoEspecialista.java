/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.medico;

import model.nivel.Nivel;


public class MedicoEspecialista extends Medico {
    /*Constructor*/
    public MedicoEspecialista(int identificacion, String nombre, String direccion, int codigoMedico, Nivel nivel) {
        super(identificacion, nombre, direccion, codigoMedico, nivel);
    }

    /*Polimorfismo*/
    @Override
    public String descripcionMedico() {
        return "Médico Especialista";
    }
    
}
