/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posicionEnArray;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class PosicionEnArray {
  public static void main(String[] args) {
    
    int[] x = {0, 459, 18904, 1, 4576, 3573, 13, 4, 6777, 23};
    int num = 13;
    matematicas.FuncionesArrays.muestraArrayInt(x);
    System.out.println("El número " + num + " está en la posición : " + matematicas.FuncionesArrays.posicionEnArray(x, num));
    
    
  }
  
}
