/**
 * Tema 8. Funciones
 * Ejercicio 16.
 * Muestra los números capicúa que hay entre 1 y 99999.
 * 
 * @author Ángeles Bueno
 */
 
import matematicas.Funciones;

public class Ejercicio16 {
  public static void main(String[] args) {
    
    for (int i = 1; i <= 99999; i++) {
      if (matematicas.Funciones.esCapicua(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
