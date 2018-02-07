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
    
    Fracciones f1 = new Fracciones("f1");
    Fracciones f2 = new Fracciones("f2");
    
    f1.setNumerador(1);
    f1.setDenominador(3);
    f2.setNumerador(2);
    f2.setDenominador(5);
    
    System.out.println("La fracción es:");
    System.out.println(f1.getNumerador());
    System.out.println("-");
    System.out.println(f1.getDenominador());
    System.out.println("");
    
    
    System.out.println("Vamos a invertir la fracción: ");
    System.out.println("");
    f1.invierte("hazlo");
    System.out.println("");
    f1.invierte("no hagas nada");
    System.out.println("");
    
    System.out.println("Vamos a multiplicar estas dos fracciones: ");
    System.out.println(f1.getNumerador() + "   " + f2.getNumerador() + "    " + f1.getNumerador() * f2.getNumerador());
    System.out.println("- x - =  -");
    System.out.println(f1.getDenominador() + "   " + f2.getDenominador() + "    " + f1.getDenominador() * f2.getDenominador());
    
    
    
    
    
    
  }
  
}
