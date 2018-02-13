/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej17;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
import java.util.Scanner;
public class BinarioADecimal {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long decimal = 0;
    
    System.out.print("Introduzca un número binario: ");
    long binario = s.nextLong();
    
    int bits = matematicas.Funciones.digitos(binario);
    
    for(int i = 0; i < bits; i++) {
      decimal += matematicas.Funciones.digitoN(binario, bits - i - 1) * matematicas.Funciones.potencia(2, i);
      
    }
    System.out.println(binario + " en binario es " + decimal + " en decimal.");
  }
}
