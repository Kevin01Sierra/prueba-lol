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
public class Asgardianos implements SuperFuerza,LanzamientoDeProyectiles {

    @Override
    public void levantar() {
        System.out.println("al ser tan parecidos a los humanos , sueles levantar los objetos usando sus brazos y apotandose de las piernas apra levantar ls objeto");
    }

    @Override
    public void sostener() {
        System.out.println("suelen usar sus manos para sostener objetos pequeños , pero cuando son objetos \n" +
"        bastante grandes usan sus dos brazos");
    }

    @Override
    public void destrozar() {
        System.out.println("/*\n" +
"        suelen usar sus brazos para destruir objetos, pero pueden usar sus puernas tambient\n" +
"        */");
    }

    @Override
    public void apuntar() {
        System.out.println("solo se puede describir de una forma estandarisada\n" +
"        que es unidireccional , pues suelen expulsar energia descontroladamene");
    }

    @Override
    public void disparar() {
        System.out.println("el lanzar el proyectil depende directamente de que erramienta usa para canalizar el poder");
    }

    @Override
    public void recargar() {
        System.out.println("el proyectil suele ser energia cosmica acumulada");
    }
    
}
