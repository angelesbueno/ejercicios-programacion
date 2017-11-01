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
    
    /**potencia de un número = Math.pow(base,exponente);
     * ese término es double, si quiero mostrarlo como entero --> casting (int)*/
    
    System.out.print("La potencia es " + (int)Math.pow(base,exponente));
  }
}
    
    
    
    
