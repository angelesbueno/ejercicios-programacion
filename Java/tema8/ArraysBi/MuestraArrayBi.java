/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muestraarraybi;

/**
 * Muestra un array bidimensional previamente generado
 *
 * @author Ángeles Bueno Aguilar
 */
public class MuestraArrayBi {
  public static void main(String[] args) {
    
    int [][] array = matematicas.FuncionesArraysBi.generaArrayBiInt(6, 6, 100, 25);
    matematicas.FuncionesArraysBi.muestraArrayBi(array, 6, 6);
    
  }
  
}
