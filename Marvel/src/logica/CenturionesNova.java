/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Usuario
 */
public class CenturionesNova implements Volar, LanzamientoDeProyectiles, SuperFuerza {

    @Override
    public void despegar() {
        System.out.println("El Centurion Nova, flexiona una de sus rodillas, levanta la cabelza, saca pecho y se eleva ");
    }

    @Override
    public void planear() {
        System.out.println("Baja los brazos a la altura del pecho, deja sus puños listos en forma de combate y se mueve a lo largo de la horizontal");
    }

    @Override
    public void aterrizar() {
        System.out.println("El Centurion baja despacion, con una rodilla flexionada, mirando la superficie de aterrizaje y en posicion de ataque");
    }

    @Override
    public void apuntar() {
        System.out.println("El Centurion achina sus ojos en busca del objetivo");
    }

    @Override
    public void disparar() {
        System.out.println("El Centurion extiende su mano derecha, cierra el puño y deja salir un rasho lacer");
    }

    @Override
    public void recargar() {
        System.out.println("El Centurio sufre un sobrecalentamiento, cambia de mano mientras se enfria");
    }

    @Override
    public void levantar() {
        System.out.println("El Centurion Nova, genera un campo electromagnetico en el cual encierra el objeto, sube su mano y empieza a subir el objeto");
    }

    @Override
    public void sostener() {
        System.out.println("El Centurion Nova no sabe que hacer con el objeto, lo mantiene en la posicion mientras se le ocurre algo");
    }

    @Override
    public void destrozar() {
        System.out.println("A decidido que el objeto no le es util, este comprime el campo electromagnetico y destruye el objeto");
    }
    
}
