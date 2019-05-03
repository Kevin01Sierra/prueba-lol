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
public class Klyntar implements SuperFuerza{

    @Override
    public void levantar() {
        System.out.println("en este caso, al ser una raza parasitaria , dependoiendo del cuerpo se levantan los objetos de forma diferente , \n" +
"        pero las apariciones de esta raza en el mundo marvel , nos han dejado ver \n" +
"        que se asemenjan a la forma en que un humano levanta los objetos");
    }

    @Override
    public void sostener() {
        System.out.println("teniendo en cuenta el caso de levantar , pasa exactamente lo mismo se guian apartir de los movimientos humanos");
    }

    @Override
    public void destrozar() {
        System.out.println("en este caso al tener una fueza mucho mayor , puede destruir objetos con sus puños y patadas");
    }
    
}
