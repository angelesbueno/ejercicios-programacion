/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej18;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
import java.util.Scanner;

public class DecimalABinario {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero: ");
    int decimal = s.nextInt();
    
    long binario = matematicas.Funciones.decimalABinario(decimal);
    
    System.out.println(decimal + " en decimal es " + binario + " en binario.");
  }
}
