/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej3;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class PruebaEjercicio {
  public static void main(String[] args) {

    //Pruebas de los Gatos
    Gato tere = new Gato("Tere");

    Gato garfield = new Gato("Garfield");

    Gato felipe = new Gato("Felipe");

    System.out.print("Felipe está maullando: ");
    felipe.maulla();

    Gato sofia = new Gato("Sofía");
    System.out.print("\nSofía está ronroneando: ");
    sofia.ronronea();
    
  }

}
