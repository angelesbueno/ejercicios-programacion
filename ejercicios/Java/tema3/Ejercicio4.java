/**
 * 3. Lectura de datos desde teclado
 *
 * 4. Escribe un programa que sume, reste, multiplique y divida dos números 
 *    introducidos por teclado.
 *
 * @author Ángeles Bueno
 */


public class Ejercicio4 {
  public static void main(String [] args) {
    System.out.print("Introduce un número:");
    int primerNumero = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce otro número:");
    int segundoNumero = Integer.parseInt(System.console().readLine());
    System.out.println("La suma de los dos números es " + (primerNumero+segundoNumero));
    System.out.println("La resta de los dos números es " + (primerNumero-segundoNumero));
    System.out.println("La multiplicación de los dos números es " + (primerNumero*segundoNumero));
    System.out.println("La división de los dos números es " + (primerNumero/segundoNumero));
    
  }
}
    
