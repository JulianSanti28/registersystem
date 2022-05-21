/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import model.*;
import model.coordinador.Coordinador;
import model.coordinador.CoordinadorPlanta;
import model.coordinador.CoordinadorResidente;
import model.coordinador.TareasEnum;
import model.medico.Medico;
import model.medico.MedicoEspecialista;
import model.medico.MedicoExterno;
import model.medico.MedicoGeneral;
import model.nivel.*;

import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE TIPO DE USUARIO A REGISTRAR:");
        System.out.println("1. Médico \n2. Coordinador");
        int opcMenu = entrada.nextInt();
        /*Variables para capturar información*/
        int opcMedico;
        int opcNivel;
        int opcSeccion;
        int opcCoord;
        int opcTarea;
        /*Se inicializan los posible objetos*/
        Medico medico = null;
        Coordinador coordinador = null;
        switch(opcMenu){
            case 1:

                Nivel nivel;
                SeccionEnum seccion;
                /*Se piden los datos*/
                System.out.println("Digite Identificación:");
                int id = entrada.nextInt();
                System.out.println("Digite Nombre:");
                String nombre = entrada.next();
                System.out.println("Digite Dirección:");
                String direccion = entrada.next();
                System.out.println("Digite Código de médico:");
                int codMedico = entrada.nextInt();
                System.out.println("DIGITE TIPO DE MÉDICO:");
                System.out.println("1. Médico General \n2. Médico especialista \n3. Médico externo");
                opcMedico = entrada.nextInt();
                switch (opcMedico){
                    case 1:
                        medico = new MedicoGeneral(id, nombre, direccion,codMedico, null);
                        System.out.println("Digite a qé nivel pertenece:");
                        System.out.println("1. Urgencias \n2. Hospitalizacion \n3. Consulta Externa \n4. Cirugía");
                        opcNivel = entrada.nextInt();
                        System.out.println("Digite sección del nivel:");
                        System.out.println("1. Sección A \n2. Sección B");
                        opcSeccion = entrada.nextInt();
                        /*Asignando la sección*/
                        if(opcSeccion == 1){
                            seccion = SeccionEnum.SECCION_A;
                        }else{
                            seccion = SeccionEnum.SECCION_B;
                        }
                        switch (opcNivel) {
                            case 1:
                                nivel = new NivelUrgencias(1, "Urgencias", "Nivel de Urgencias", seccion);
                                medico.setNivel(nivel);
                                break;
                            case 2:
                                nivel = new NivelHospitalizacion(2, "Hospitalización", "Nivel de Hospitalización", seccion);
                                medico.setNivel(nivel);
                                break;
                            case 3:
                                nivel = new NivelConsultaExterna(3, "Consulta Externa", "Nivel de Consulta Externa", seccion);
                                medico.setNivel(nivel);
                                break;
                            case 4:
                                nivel = new NivelCirugia(2, "Cirugía", "Nivel de Cirugía", seccion);
                                medico.setNivel(nivel);
                                break;
                        }
                        break;
                    case 2:
                        medico = new MedicoEspecialista(id, nombre, direccion,codMedico, null);
                        System.out.println("Digite a qé nivel pertenece:");
                        System.out.println("1. Urgencias \n2. Hospitalizacion \n3. Consulta Externa \n4. Cirugía");
                        opcNivel = entrada.nextInt();
                        System.out.println("Digite sección del nivel:");
                        System.out.println("1. Sección A \n2. Sección B");
                        opcSeccion = entrada.nextInt();
                        /*Asignando la sección*/
                        if(opcSeccion == 1){
                            seccion = SeccionEnum.SECCION_A;
                        }else{
                            seccion = SeccionEnum.SECCION_B;
                        }
                        switch (opcNivel){
                            case 1:
                                nivel = new NivelUrgencias(1, "Urgencias", "Nivel de Urgencias", seccion);
                                medico.setNivel(nivel);
                                break;
                            case 2:
                                nivel = new NivelHospitalizacion(2, "Hospitalización", "Nivel de Hospitalización", seccion);
                                medico.setNivel(nivel);
                                break;
                            case 3:
                                nivel = new NivelConsultaExterna(3, "Consulta Externa", "Nivel de Consulta Externa", seccion);
                                medico.setNivel(nivel);
                                break;
                            case 4:
                                nivel = new NivelCirugia(2, "Cirugía", "Nivel de Cirugía", seccion);
                                medico.setNivel(nivel);
                                break;
                        }
                        break;
                    case 3:
                        medico = new MedicoExterno(id, nombre, direccion,codMedico, null);
                        System.out.println("Digite a qé nivel pertenece:");
                        System.out.println("1. Urgencias \n2. Hospitalizacion \n3. Consulta Externa \n4. Cirugía");
                        opcNivel = entrada.nextInt();
                        System.out.println("Digite sección del nivel:");
                        System.out.println("1. Sección A \n2. Sección B");
                        opcSeccion = entrada.nextInt();
                        /*Asignando la sección*/
                        if(opcSeccion == 1){
                            seccion = SeccionEnum.SECCION_A;
                        }else{
                            seccion = SeccionEnum.SECCION_B;
                        }
                        switch (opcNivel){
                            case 1:
                                nivel = new NivelUrgencias(1, "Urgencias", "Nivel de Urgencias", seccion);
                                medico.setNivel(nivel);
                                break;
                            case 2:
                                nivel = new NivelHospitalizacion(2, "Hospitalización", "Nivel de Hospitalización", seccion);
                                medico.setNivel(nivel);
                                break;
                            case 3:
                                nivel = new NivelConsultaExterna(3, "Consulta Externa", "Nivel de Consulta Externa", seccion);
                                medico.setNivel(nivel);
                                break;
                            case 4:
                                nivel = new NivelCirugia(2, "Cirugía", "Nivel de Cirugía", seccion);
                                medico.setNivel(nivel);
                                break;
                        }


                }
                break;
            case 2:
                /*Posibles Tareas*/
                TareasEnum tarea1 ;
                TareasEnum tarea2 = null;
                /*Se piden los datos*/
                System.out.println("Digite Identificación:");
                id = entrada.nextInt();
                System.out.println("Digite Nombre:");
                nombre = entrada.next();
                System.out.println("Digite Dirección:");
                direccion = entrada.next();
                System.out.println("Digite Código de Coordinador:");
                int codCoord = entrada.nextInt();
                System.out.println();
                System.out.println("DIGITE TIPO DE COORDINADOR:");
                System.out.println("1. De Planta \n2. Residente ");
                opcCoord = entrada.nextInt();
                System.out.println("¿QUÉ TAREA DESE AGREGAR?");
                System.out.println("1. ASIGNACIÓN_HORARIOS \n2. ASIGNACIÓN_RECURSOS_HUMANOS \n3. ASIGNACIÓN_RECURSOS_ECONÓMICOS");
                opcTarea = entrada.nextInt();
                if(opcTarea == 1){
                    tarea1 = TareasEnum.ASIGNACION_HORARIOS;
                }else if(opcTarea == 2){
                    tarea1 = TareasEnum.ASIGNACION_RECURSOS_HUMANOS;
                }else{
                    tarea1 = TareasEnum.ASIGNACION_RECURSOS_ECONOMICOS;
                }
                System.out.println("¿DESEA AGREGAR OTRA TAREA?");
                System.out.println("1. Sí \n2. No");
                int more = entrada.nextInt();
                if(more == 1){
                    System.out.println("¿QUÉ TAREA DESE AGREGAR?");
                    System.out.println("1. ASIGNACIÓN_HORARIOS \n2. ASIGNACIÓN_RECURSOS_HUMANOS \n3. ASIGNACIÓN_RECURSOS_ECONÓMICOS");
                    opcTarea = entrada.nextInt();
                    if(opcTarea == 1){
                        tarea2 = TareasEnum.ASIGNACION_HORARIOS;
                    }else if(opcTarea == 2){
                        tarea2 = TareasEnum.ASIGNACION_RECURSOS_HUMANOS;
                    }else{
                        tarea2 = TareasEnum.ASIGNACION_RECURSOS_ECONOMICOS;
                    }
                }
                switch (opcCoord){
                    case 1:
                        coordinador = new CoordinadorPlanta(id, nombre, direccion, codCoord);
                        if(tarea1 != null){
                            coordinador.getTareas().add(tarea1);
                        }
                        if(tarea2 != null){
                            coordinador.getTareas().add(tarea2);
                        }
                        break;
                    case 2:
                        coordinador = new CoordinadorResidente(id, nombre, direccion, codCoord);
                        if(tarea1 != null){
                            coordinador.getTareas().add(tarea1);
                        }
                        if(tarea2 != null) {
                            coordinador.getTareas().add(tarea2);
                        }
                        break;
                }
                break;
        }

        System.out.println("Información Registrada:");
        if(medico != null){
            System.out.println("Identificación: " + medico.getIdentificacion());
            System.out.println("Nombre: " + medico.getNombre());
            System.out.println("Dirección: " + medico.getDireccion());
            System.out.println("Código Médico: " + medico.getCodigoMedico());
            System.out.println("Tipo de Médico: " + medico.descripcionMedico());
            System.out.println("Nivel al que pertenece: " + medico.getNivel().getNombreNivel());
            System.out.println("Sección a la que pertenece: "+ medico.getNivel().getSeccionEnum().toString());

        }else if(coordinador != null){
            System.out.println("Identificación: " + coordinador.getIdentificacion());
            System.out.println("Nombre: " + coordinador.getNombre());
            System.out.println("Dirección: " + coordinador.getDireccion());
            System.out.println("Código Coordinador: " + coordinador.getCodigoCoordinador());
            System.out.println("Tipo de Coordinador: " + coordinador.descripcionCoordinador());
            System.out.println("Tareas:");
            for(int i = 0; i<coordinador.getTareas().size();i++){
                System.out.println("Tarea " + (i+1) + ": " + coordinador.getTareas().get(i));
            }

        }else{
            System.out.println("LO SENTIMOS, NO SE REGISTRÓ NINGUNA INFORMACIÓN.");
        }



    }
    
}
