/**
 * 4. Sentencia condicional
 *
 * 20. Realiza un programa que diga si un número entero positivo introducido 
 *     por teclado es capicúa. Se permiten números de hasta 5 cifras.
 *
 * @author Ángeles Bueno
 */
 
 
public class Ejercicio20 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número positivo y de hasta 5 cifras y te diré si es capicúa: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero < 10) {
      System.out.print("El número " + numero + " es capicúa.");
    }
    
    if ((numero >= 10) && (numero < 100)) {
      if ((numero / 10) == (numero % 10)) {
        System.out.print("El número " + numero + " es capicúa.");
      } else {
          System.out.print("El número " + numero + " no es capicúa.");
        }
    }
    
    if ((numero >= 100) && (numero < 1000)) {
      if ((numero / 100) == (numero % 100)) {
        System.out.print("El número " + numero + " es capicúa.");
      } else {
          System.out.print("El número " + numero + " no es capicúa.");
        }
    }
    
    if ((numero >= 1000) && (numero < 10000)) {
      if (((numero / 1000) == (numero % 10)) && ((((numero / 100) % 10) == ((numero / 10) % 10)))) {
        System.out.print("El número " + numero + " es capicúa.");
      } else {
          System.out.print("El número " + numero + " no es capicúa.");
        }
    }
    
    if ((numero >= 10000) && (numero < 100000)) {
      if (((numero / 10000) == (numero % 10)) && ((((numero / 1000) % 10) == ((numero / 10) % 10)))) {
        System.out.print("El número " + numero + " es capicúa.");
      } else {
          System.out.print("El número " + numero + " no es capicúa.");
        }
    }
    
  }
}
  
        
      
      
    
    
    
    
    
