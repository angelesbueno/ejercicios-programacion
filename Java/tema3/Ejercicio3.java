/**
 * 3. Lectura de datos desde teclado
 *
 * 3. Realiza un conversor de pesetas a euros. La cantidad de pesetas que se 
 *    quiere convertir debe ser introducida por teclado.
 *
 * @author Ángeles Bueno
 */


public class Ejercicio3 {
  public static void main(String args[]) {
      
      System.out.print("Introduce una cantidad en pesetas: ");
      int pesetas = Integer.parseInt(System.console().readLine());
      //System.out.print("La cantidad en euros es: " + (pesetas/166.386));
      System.out.printf("%d pesetas son %.2f euros: ", pesetas,(pesetas/166.386));
      
      
      
    }
  }
