/**
 * 4. Sentencia condicional
 *
 * 14. Realiza un programa que diga si un número introducido por teclado 
 *     es par y/o divisible entre 5.
 *
 * @author Ángeles Bueno
 */

public class Ejercicio14 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if ((numero % 2) == 0) {
      System.out.print("El número " + numero + " es par");
    } else {
        System.out.print("El número " + numero + " no es par");
      }
      
    if ((numero % 5) == 0) {
      System.out.print(" y divisible entre 5.");
    } else {
        System.out.print(" y no divisible entre 5.");
      }
  }
}
        
      
