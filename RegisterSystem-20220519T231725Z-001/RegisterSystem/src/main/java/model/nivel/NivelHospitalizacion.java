/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.nivel;

import model.SeccionEnum;


public class NivelHospitalizacion extends Nivel {
    /*Constructor Referenciando al Padre*/
    public NivelHospitalizacion(int codigoNivel, String nombreNivel, String descripcionaNivel, SeccionEnum seccion) {
        super(codigoNivel, nombreNivel, descripcionaNivel, seccion);
    }
    /*Polimorfismo*/
    @Override
    public void descripcionNivel() {
        System.out.println("Hola, soy Nivel Hospitalizaciòn");
    }
    
}
