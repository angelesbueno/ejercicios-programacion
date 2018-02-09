/**
 * Funciones
 *
 * Prueba
 *
 * @author Ángeles Bueno
 */
 
public class NumeroPrimoConFuncion {
  public static void main(String[] args) {
    
    System.out.print("Introduzca un número entero positivo: "); 
    int n = Integer.parseInt(System.console().readLine());
    
    if (esPrimo(n)) {
      System.out.println("El " + n + " es primo.");
    } else {
      System.out.println("El " + n + " no es primo.");
    } 
  }
  
  public static boolean esPrimo(int x) {
    
    for (int i = 2; i < x; i++) { 
      if ((x % i) == 0) {
        return false; 
      }
    }
    return true; 
  }
}
