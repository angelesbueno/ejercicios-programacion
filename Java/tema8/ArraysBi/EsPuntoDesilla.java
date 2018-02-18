/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espuntodesilla;

import java.util.Scanner;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class EsPuntoDesilla {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int [][] array = matematicas.FuncionesArraysBi.generaArrayBiInt(3, 2, 20, 0);
    matematicas.FuncionesArraysBi.muestraArrayBi(array, 3, 2);
    System.out.print("Dime qué fila del array: ");
    int fila = s.nextInt();
    System.out.print("Dime qué columna del array: ");
    int columna = s.nextInt();
    matematicas.FuncionesArraysBi.esPuntoDeSilla(array, fila, columna);
    
  }
  
}
