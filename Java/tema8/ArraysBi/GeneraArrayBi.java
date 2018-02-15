/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generaarraybi;

/** 
 * Genera un array de tamaño n x m con números aleatorios 
 * cuyo intervalo (mínimo y máximo) se indica como parámetro.
 *
 * @author Ángeles Bueno Aguilar
 */
public class GeneraArrayBi {
  public static void main(String[] args) {
    
    int[][] n = matematicas.FuncionesArraysBi.generaArrayBiInt(5, 5, 3, 22);
    matematicas.FuncionesArraysBi.muestraArrayBi(n, 5, 5);
    
  }
  
}
