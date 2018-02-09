/**
 * Tema 8. Funciones
 * Ejercicio 15.
 * Muestra los números primos que hay entre 1 y 1000.
 * 
 * @author Ángeles Bueno
 */
 
import matematicas.Funciones;

public class Ejercicio15 {
  public static void main(String[] args) {
    
    for (int i = 1; i <= 1000; i++) {
      if (matematicas.Funciones.esPrimo(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
