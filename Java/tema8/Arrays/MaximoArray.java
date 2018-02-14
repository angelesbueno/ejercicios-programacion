/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximoarray;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class MaximoArray {
  public static void main(String[] args) {
    
    int[] numero = {0, 459, 18904, 1, 4576, 3573, 13, 4, 6777, 23};
    matematicas.FuncionesArrays.muestraArrayInt(numero);
    System.out.println("El número máximo del array es: " + matematicas.FuncionesArrays.maximoArrayInt(numero));
  }
  
}
