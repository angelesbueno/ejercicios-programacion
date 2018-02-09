/**
 * 3. Lectura de datos desde teclado
 *
 * 5. Escribe un programa que calcule el área de un rectángulo.
 *
 * @author Ángeles Bueno
 */

public class Ejercicio5 {
  public static void main(String[] args) {
  
  System.out.print("Escribe un número que sea la base de tu rectángulo en cm: ");
  int base = Integer.parseInt(System.console().readLine());
  System.out.print("Escribe un número que sea la altura de tu rectángulo en cm: ");
  int altura = Integer.parseInt(System.console().readLine());
  System.out.print("El área de tu rectángulo es: " + (base*altura));
  
  }
}
  

