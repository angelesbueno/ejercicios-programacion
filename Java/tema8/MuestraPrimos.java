/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej15;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
import matematicas.Funciones;
public class MuestraPrimos {
  public static void main(String[] args) {
    
    for (int i = 1; i <= 1000; i++) {
      if (matematicas.Funciones.esPrimo(i)) {
        System.out.print(i + " ");
      } 
    }
  }
}
