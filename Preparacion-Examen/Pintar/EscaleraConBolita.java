/**
 * Programación
 * Tema 7 Arrays
 * 13 de diciembre de 2017
 * 
 * Este programa pinta una escalera con una bola aleatoria situada en la parte
 * baja de cualquier escalón, la bola no puede estar levitando en mitad del escalón.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class EscaleraConBolita {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int peldaño = 4;
    int altura = 4;
    int anchura = 8;
    int bolita = bolita = (int)(Math.random() * 4); 
    
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < peldaño; j++) {
        for (int r = 0; r < anchura; r++) {
          System.out.print("*");
        }
        if ((i == bolita) && (j == 3)) {
          System.out.print(" O");
        }
          System.out.println();
        }
      
      anchura += 2;
    }
  }
}
