/**
 * 5. Bucles.
 *
 * 16. Escribe un programa que diga si un número introducido por teclado es 
 *     o no primo. Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio16 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número y te diré si es primo o no: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int i = 2;
    boolean esPrimo = true;
    
    while (i < numero) {
      if ((numero % i) == 0) {
        esPrimo = false;
        
      }
      i++; 
    }
    
    if (esPrimo) {
      System.out.println("El número " + numero + " es primo.");
    } else {
      System.out.println("El número " + numero + " no es primo.");
    }
    
    
  }
}
        
    

      
    
  
      
      
    
