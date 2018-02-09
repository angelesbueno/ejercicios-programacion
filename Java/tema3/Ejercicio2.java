/**
 * 3. Lectura de datos desde teclado
 *
 * 2. Realiza un conversor de euros a pesetas. La cantidad de euros que se 
 *    quiere convertir debe ser introducida por teclado.
 *
 * @author Ángeles Bueno
 */


public class Ejercicio2 {
  public static void main(String args[]) {
      
      System.out.print("Introduce una cantidad en euros: ");
      double euros = Double.parseDouble(System.console().readLine());
      System.out.print("La cantidad en pesetas es: " + (int)(euros*166.386));
      
      
      
    }
  }
