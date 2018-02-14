package minimoarray;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ángeles Bueno Aguilar
 */

public class MinimoArray {
  public static void main(String[] args) {
    
    int[] x = {34, 56, 4, 68, 3, 100, 87, 32, 11, 50};
    
    matematicas.FuncionesArrays.muestraArrayInt(x);
    System.out.println("El número mínimo del array es : " + matematicas.FuncionesArrays.minimoArrayInt(x));
  }
}
