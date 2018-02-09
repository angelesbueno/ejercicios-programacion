/**
 * 4. Sentencia condicional
 *
 * 19. Realiza un programa que nos diga cuántos dígitos tiene un número entero 
       que puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 *
 * @author Ángeles Bueno
 */
 
 
public class Ejercicio19 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número y te diré cuántos dígitos tiene, se permiten números de hasta 5 cifras: ");
    int numero = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if (numero < 10) {
      System.out.println("El número " + numero + " tiene 1 cifra.");
    }
    
    if ((numero >= 10) && (numero < 100)) {
      System.out.println("El número " + numero + " tiene 2 cifras.");
    }
    
    if ((numero >= 100) && (numero < 1000)) {
      System.out.println("El número " + numero + " tiene 3 cifras.");
    }
    
    if ((numero >= 1000) && (numero < 10000)) {
      System.out.println("El número " + numero + " tiene 4 cifras.");
    }
    
    if ((numero >= 10000) && (numero < 100000)) {
      System.out.println("El número " + numero + " tiene 5 cifras.");
    }
    
    if (numero >= 100000) {
      System.out.println("No están permitidos los números de más de 5 cifras.");
    }
      
  }
}
    
      
  
