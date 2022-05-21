/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.coordinador;

import model.coordinador.Coordinador;

/**
 *
 * @author INGESIS
 */
public class CoordinadorResidente extends Coordinador {

    public CoordinadorResidente(int identificacion, String nombre, String direccion, int codigoCoordinador) {
        super(identificacion, nombre, direccion, codigoCoordinador);
    }

    @Override
    public String descripcionCoordinador() {
        return "Coordinador Residente";
    }

}
