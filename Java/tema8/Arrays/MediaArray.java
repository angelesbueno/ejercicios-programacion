/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaarray;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class MediaArray {
  public static void main(String[] args) {
    
    int[] x = matematicas.FuncionesArrays.generaArrayInt(10, 0, 9);
    matematicas.FuncionesArrays.muestraArrayInt(x);
    System.out.println("La media de los números dentro del array es: " + matematicas.FuncionesArrays.mediaArrayInt(x));
  }
}
