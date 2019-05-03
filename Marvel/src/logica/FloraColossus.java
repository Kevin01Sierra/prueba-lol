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
public class FloraColossus implements SuperFuerza{

    @Override
    public void levantar() {
        System.out.println("suelen levantar los objetos de forma curiosa , hacen una especie de capullo al rededor de estos objetos \n" +
"        con sus raices para luego los levantarlos");
    }

    @Override
    public void sostener() {
        System.out.println("de igual forma que el levantar los objetos, para sostenerlos , usas sus raices alrededor del objeto");
    }

    @Override
    public void destrozar() {
        System.out.println("para destruir un objeto duelen apoyarse en la fuerza ejercida por otro objeto que estan sosteniendo , o usando muchas raices \n" +
"        para comprimirlo y asi destruir el objeto ");
    }
    
}
