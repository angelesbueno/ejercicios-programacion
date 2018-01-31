/**
 * Programación
 * Tema 7 Arrays
 * 13 de diciembre de 2017
 * 
 * Realiza un programa que pinte un degradado por pantalla de arriba hacia abajo hecho con asteriscos.
 * Se pide al usuario la anchura del degradado, a continuación se debe pintar una línea continua hecha
 * de asteriscos. En la siguiente línea habrá un hueco en una posición aleatoria; en la siguiente, dos
 * huecos también colocados aleatoriamente... así hasta la última línea en la que habrá un único
 * asterisco.   
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Degradado {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca la altura para hacer un degradado:  ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int[] n = new int[altura];
    boolean distinto = true;
    int indice;
    int limite = 0;
    
    for (int d = 0; d < altura; d++) {
      
      indice = 0;
    
      do {
        distinto = true;
      
        n[indice] = (int)(Math.random() * altura);
        
          if (indice > 0) {
            for (int r = 0; r < indice; r++) {
          
              if (n[r] == n[indice]) {
                distinto = false;
              }
            }
          }
          if (distinto == true) {
            indice++;
          }
      } while (indice < altura);

      for (int i = 0; i < altura - limite; i++) {
        for (int r = 0; r < limite; r++) {
        
          if (n[r] == i) {
            System.out.print(" ");
          }
        }
        System.out.print("*");
      }
      limite++;
      System.out.println();
    }
  }
}
