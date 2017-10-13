/**
 * 3. Lectura de datos desde teclado
 *
 * 9. Escribe un programa que calcule el volumen de un cono según la fórmula V = 1πr2h
 *
 * @author Ángeles Bueno
 */


public class Ejercicio9 {
  public static void main(String[] args) {
    System.out.print("Escribe un número que sea el área del círculo de la base:");
    int area = Integer.parseInt(System.console().readLine());
    System.out.print("Escribe un número que sea la altura del cono:");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.print("El volumen del cono es " + (area*altura/3));
  }
}
