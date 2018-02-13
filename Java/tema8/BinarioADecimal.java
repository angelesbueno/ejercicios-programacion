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
    
    System.out.print("Introduzca un número binario: ");
    long binario = s.nextLong();
    
    long decimal = matematicas.Funciones.binarioADecimal(binario);
    
    System.out.println(binario + " en binario es " + decimal + " en decimal.");
  }
}
