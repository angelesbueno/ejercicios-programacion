/**
 * 5. Bucles.
 *
 * 15. Escribe un programa que dados dos números, uno real (base) y un entero 
       positivo (exponente), saque por pantalla todas las potencias con 
       base el numero dado y exponentes entre uno y el exponente introducido. 
       No se deben utilizar funciones de exponenciación. Por ejemplo, si 
       introducimos el 2 y el 5, se deberán mostrar 21, 22, 23, 24 y 25.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio15 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número real como base: ");
    double base = Integer.parseInt(System.console().readLine()); 
    
    System.out.print("Introduce el exponente de ese número (entero positivo): ");
    int exponenteFinal = Integer.parseInt(System.console().readLine());
    
    int exponente = 1;
    double potencia = base * base;
    
    for (int i = 1; i <= exponenteFinal; i++) {
      System.out.println(base + "^" + exponente + "=" + potencia);
      exponente++;
      potencia = potencia*base;
    }
  }
}
      
      
      
    
   
      
  
    
