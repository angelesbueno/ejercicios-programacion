/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class MuestraCapicuas {
  public static void main(String[] args) {
    for (int i = 1; i <= 99999; i++) {
      if (matematicas.Funciones.esCapicua(i)) {
        System.out.print(i + " ");
      }
    }
  }
  
}
