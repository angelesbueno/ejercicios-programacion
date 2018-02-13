/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class PruebaFraccion {
  public static void main(String[] args) {
    
    Fraccion f1 = new Fraccion(1,3);
    Fraccion f2 = new Fraccion(2,5);
    Fraccion f3 = new Fraccion(24,16);

    System.out.println(f1);    
    System.out.println("Vamos a invertir la fracción:");
    System.out.println(f1.invierte());
    System.out.println("Vamos a multiplicar fracciones:");
    System.out.println(f1.multiplica(f2, 2, 5));
    System.out.println("Vamos a dividir " + f1 + " / " + f2);
    System.out.println(f1.divide(f2, 2, 5));
    System.out.println("Vamos a simplificar una fracción:");
    System.out.println(f1.simplifica());
  }
}
