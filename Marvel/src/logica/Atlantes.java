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
public class Atlantes implements Velocidad, SuperFuerza, LanzamientoDeProyectiles{

    @Override
    public void arrancar() {
        System.out.println("El atlante esta quieto y empieza a dar brazadas, hasta quedar en paralelo al suelo");
    }

    @Override
    public void acelerar() {
        System.out.println("El Atlante coloca las manos a sus costados, agacha la cabeza y se impulsa a gran velocidad");
    }

    @Override
    public void derrapar() {
        System.out.println("El Atlante gira de direccion bruscamente en el agua, crea resistencia al agua pero no baja su velocidad ");
    }

    @Override
    public void frenar() {
        System.out.println("El Atlante, se pone en vertical en referente al suelo, extiende sus extremidades para detenerse ");
    }

    @Override
    public void levantar() {
        System.out.println("El Atlante se agacha, respira profundo, hace un sonido casi inhaudible, y empieza a levantar el objeto de gran peso");
    }

    @Override
    public void sostener() {
        System.out.println("El Atlante lo levanta el objeto por ensima de su cabeza, y suelta un grito desgarrador indicando su poder");
    }

    @Override
    public void destrozar() {
        System.out.println("El Atlante fastidiado de levantar el objeto, lo deja en una mano izquierda, baja la mano derecha para tomar impulso y destroza el objeto ");
    }

    @Override
    public void apuntar() {
        System.out.println("El Atlante coloca el tridente sobre su hombro y  gira en busca de su objetivo");
    }

    @Override
    public void disparar() {
        System.out.println("Una vez encontrado el objetivo, el Atlante flexiona su brazo y lanza con fuerza el tridente ");    }

    @Override
    public void recargar() {
        System.out.println("El Atlante va en busca del tridente que lanzo porque este no posee otro");
    }
    
}
