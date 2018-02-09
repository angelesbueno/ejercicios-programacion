/**
 * 4. Sentencia condicional
 *
 * 17. Escribe un programa que diga cuál es la última cifra de un número 
       entero introducido por teclado.
 *
 * @author Ángeles Bueno
 */
 
 
public class Ejercicio17 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número y te diré cual es su última cifra: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número " + numero + " es: " + (numero % 10));
  }
}
    
      
      
      
