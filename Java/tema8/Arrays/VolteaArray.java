/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volteaarray;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class VolteaArray {
  public static void main(String[] args) {
    
    int[] numero = {0, 459, 18904, 1, 4576, 3573, 13, 4, 6777, 23};
    matematicas.FuncionesArrays.muestraArrayInt(numero);
    int[] numero2 = matematicas.FuncionesArrays.volteaArrayInt(numero);
    matematicas.FuncionesArrays.muestraArrayInt(numero2);
  }
  
}
