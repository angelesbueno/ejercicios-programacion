/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estaenarray;
import java.util.Scanner;
/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class EstaEnArray {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] x = matematicas.FuncionesArrays.generaArrayInt(5, 0, 9);
    matematicas.FuncionesArrays.muestraArrayInt(x);
    System.out.println("¿Qué número quieres saber si está en el array?: ");
    int num = s.nextInt();
    
    if (matematicas.FuncionesArrays.estaEnArray(x, num)) {
      System.out.println("El número " + num + " está en el array");
    } else {
      System.out.println("El número " + num + " no está en el array");
    }
  }
  
  
  
}

