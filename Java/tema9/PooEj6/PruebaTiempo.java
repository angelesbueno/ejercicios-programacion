/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class PruebaTiempo {
  public static void main(String[] args) {
    
    Tiempo t = new Tiempo(1, 20, 30);
    Tiempo t2 = new Tiempo(0,50,40);
    
    System.out.println("Intervalo de tiempo 1: " + t);
    System.out.println("Intervalo de tiempo 2: " + t2);
    System.out.println("Suma de los dos intervalos: " + t.suma(t2, 0, 50, 40));
    System.out.println("Resta de los dos intervalos: " + t.resta(t2, 0, 50, 40));
    
    // la suma sale bien pero la resta no
  }
  
}
