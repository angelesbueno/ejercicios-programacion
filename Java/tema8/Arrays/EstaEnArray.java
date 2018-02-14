/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estaenarray;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class EstaEnArray {
  public static void main(String[] args) {
    
    int[] x = matematicas.FuncionesArrays.generaArrayInt(5, 0, 9);
    matematicas.FuncionesArrays.muestraArrayInt(x);
    matematicas.FuncionesArrays.estaEnArray(x, 3);
  }
}
