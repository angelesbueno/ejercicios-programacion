/**
 * 3. Lectura de datos desde teclado
 *
 * 6. Escribe un programa que calcule el área de un triángulo.
 *
 * @author Ángeles Bueno
 */


public class Ejercicio6 {
  public static void main(String[] args) {
  
  System.out.print("Escribe un número que sea la base de tu triángulo en cm: ");
  int base = Integer.parseInt(System.console().readLine());
  System.out.print("Escribe un número que sea la altura de tu triángulo en cm: ");
  int altura = Integer.parseInt(System.console().readLine());
  System.out.print("El área de tu triángulo es: " + (base*altura/2));
  
  }
}
