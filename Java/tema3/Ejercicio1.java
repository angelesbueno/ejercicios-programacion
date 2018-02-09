/**
 * 3. Lectura de datos desde teclado
 *
 * 1. Realiza un programa que pida dos números y que luego muestre el 
 *    resultado de su multiplicación.
 *
 * @author Ángeles Bueno
 */


public class Ejercicio1 {
  public static void main(String [] args) {
    System.out.print("Escribe un número entero:");
    int primerNumero = Integer.parseInt(System.console().readLine());
    System.out.print("Escribe otro número entero:");
    int segundoNumero = Integer.parseInt(System.console().readLine());
    System.out.print("La multiplicación de los dos números es " + (primerNumero*segundoNumero));
  }
}
  
