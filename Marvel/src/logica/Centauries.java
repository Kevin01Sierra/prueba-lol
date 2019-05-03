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
public class Centauries implements LanzamientoDeProyectiles {

    @Override
    public void apuntar() {
        System.out.println("El Centauri, silva suavemente, para que su flecha se ponga a la derecha, mientras fija el objetivo");
    }

    @Override
    public void disparar() {
        System.out.println("Este aumenta el sonido para lanzar la flecha a su enemigo");
    }

    @Override
    public void recargar() {
        System.out.println("El Centauri hace un sonido inhalando, para que la flecha vuelva a su dueño, la cual toma en la mano cuando llega");
    }
    
}
