/**
 * Programación
 * Tema 7 Arrays
 * 13 de diciembre de 2017
 * 
 *  Este programa simula una tableta de chocolate con bocados aleatorios
    en una probabilidad de 1 a 5.
       
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class TabletaDeChocolateConMordiscoAleatorio {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Este programa pinta por pantalla una tableta ed chocolate ");
    System.out.println(" por pantalla con un bocado aleatorio\n");
    
    System.out.print("Introduce la altura que quieres qe tenga la tableta: ");
    int altura = Integer.parseInt(s.nextLine());
    
    System.out.print("Y la anchura: ");
    int ancho = Integer.parseInt(System.console().readLine());
    
    int numero;
    
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < ancho; j++) {
        
        numero = (int)(Math.random() * 5 + 1);
        
        switch(numero) {
          case 1:
          case 2:
          case 3:
          case 4:
            System.out.print("#");
            break;
          case 5:
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
