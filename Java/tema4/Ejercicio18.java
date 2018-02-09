/**
 * 4. Sentencia condicional
 *
 * 18. Escribe un programa que diga cuál es la primera cifra de un número 
       entero introducido por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author Ángeles Bueno
 */
 
 
public class Ejercicio18 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número y te diré cual es su primera cifra, se permiten números de hasta 5 cifras: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    
    if (numero < 10) {
      System.out.println("La primera cifra del número " + numero + " es: " + numero);
    }
    
    if ((numero < 100) && (numero >= 10)) {
      System.out.println("La primera cifra del número " + numero + " es: " + (numero / 10));
    }
    
    if ((numero < 1000) && (numero >= 100)) {
      System.out.println("La primera cifra del número " + numero + " es: " + (numero / 100));
    }
    
    if ((numero < 10000) && (numero >= 1000)) {
      System.out.println("La primera cifra del número " + numero + " es: " + (numero / 1000));
    }
    
    if ((numero < 100000) && (numero >= 10000)) {
      System.out.println("La primera cifra del número " + numero + " es: " + (numero / 10000));
    }
    
    if (numero >= 100000) {
      System.out.println("No están permitidos los números de más de 5 cifras.");
    }
  }
}
      
    
    
      
      
