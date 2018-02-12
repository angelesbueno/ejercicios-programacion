/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ángeles Bueno Aguilar
 */
import java.util.Scanner;
public class ArrayGato {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    GatoNuevo[] gatete = new GatoNuevo[5];
    String nombreInt;
    String colorInt;
    String razaInt;
    System.out.println("A continuación, vaya introduciendo los datos de los gatos");
    
    for (int i = 1; i <= 4; i++) {
      gatete[i] = new  GatoNuevo();
      System.out.println("Gato " + i);
      System.out.print("Nombre: ");
      nombreInt = s.next();
      gatete[i].setNombre(nombreInt);
      System.out.print("Color: ");
      colorInt = s.next();
      gatete[i].setColor(colorInt);
      System.out.print("Raza: ");
      razaInt = s.next();
      gatete[i].setRaza(razaInt);
      System.out.println("----------------");
    }
    
    for (int i = 1; i <= 4; i++) {
      System.out.println(gatete[i]);
    }
  }
  
}
