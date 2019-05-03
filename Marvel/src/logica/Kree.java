/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author LA MATRIX
 */
public class Kree implements InteligenciaSobreHumana,LanzamientoDeProyectiles {

    @Override
    public void analizar() {
        System.out.println("tienen una gran capasidad de analisis pues , gracias a ello , en algun momento de su historia\n" +
"        se dieron cuenta de la necesidad de evoplucionar y decidieron centrar toda su inteligencia en esta\n" +
"        misiom");
    }

    @Override
    public void planear() {
        System.out.println("suelen tener planes a muy largo plazo pero que se enfocan en buscar desarrollo , como lo fue las experiementacion con los humanos para "
                + "poder llevar a su evolucion");
    }

    @Override
    public void crear() {
        System.out.println("al ser considerada una raza imperialista y militarisada su principal desarrollo se enfoco en el diseño de armamento");
    }

    @Override
    public void apuntar() {
        System.out.println("para apuntar suelen usar sus guantes , para ello , miden la precisison \n" +
"        basada en ubicacion de su brazo , es decir , en la direccion en que este ubicado \n" +
"        el brazo , posiblemente disparen hacia alli ");
    }

    @Override
    public void disparar() {
        System.out.println("para lanzar suelen enfocarse en un punto y disparan , para ello tienen que aguantar un pequeño retroceso hacia atraz ");
    }

    @Override
    public void recargar() {
        System.out.println("para reacragar solo tienen que esperar unos momemento a que su guante vuelva a estar listo \n" +
"         para disparar , suelen bajar el brazo por un moemnto ");
    }
    
}
