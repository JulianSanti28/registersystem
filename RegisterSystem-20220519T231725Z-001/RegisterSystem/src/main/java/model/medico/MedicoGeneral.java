/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.medico;

import model.nivel.Nivel;


public class MedicoGeneral extends Medico {
    /*Constructor*/
    public MedicoGeneral(int identificacion, String nombre, String direccion, int codigoMedico, Nivel nivel) {
        super(identificacion, nombre, direccion, codigoMedico, nivel);
    }
    /*Polimorfismo*/
    @Override
    public String descripcionMedico() {
        return "Mèdico General";
    }
    
}
