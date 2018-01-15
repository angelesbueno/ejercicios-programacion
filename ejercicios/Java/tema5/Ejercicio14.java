/**
 * 5. Bucles.
 *
 * 14. Escribe un programa que pida una base y un exponente (entero positivo) 
 *     y que calcule la potencia.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio14 {
  public static void main(String[] args) {
    
    System.out.print("Introduce la base de un número (entero positivo): ");
    int base = Integer.parseInt(System.console().readLine()); 
    
    System.out.print("Introduce el exponente de ese número (entero positivo): ");
    int exponente = Integer.parseInt(System.console().readLine());
    
    if (exponente == 0) {
      System.out.print("La potencia de " + base + " es " + " 1 ");
    }
    if (exponente == 1) {
      System.out.print("La potencia de " + base + " es " + +base);
    }
    if (exponente > 1) {
      
      double potencia = base;
      
      for (int i = 2; i <= exponente; i++) {
        potencia = potencia * base;
      }
      
      System.out.print(base + "^" + exponente + "=" + potencia);
    }
  }
}
        
      

    
    
    
    
