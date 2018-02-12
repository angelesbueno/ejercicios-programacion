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
public class ArrayGato2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //reservamos el array
    GatoNuevo2[] gatete = new GatoNuevo2[5];
    
    //creamos los objetos
    gatete[1] = new GatoNuevo2("Frini", "Gris", "Común");
    gatete[2] = new GatoNuevo2("Mildred", "Marrón", "Siamés");
    gatete[3] = new GatoNuevo2("Esculpi", "Negro", "Persa");
    gatete[4] = new GatoNuevo2("Poli", "Blanco", "Egipcio");
    
    //se muestra el array con toString
    for (int i = 1; i <= 4; i++) {
      System.out.println(gatete[i]);
    }
  }
}
