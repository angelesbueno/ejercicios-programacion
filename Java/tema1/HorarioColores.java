/**
 * 1. Salida de datos por pantalla
 *
 * 5. Modifica el programa anterior añadiendo colores. 
 *    Puedes mostrar cada asignatura de un color diferente.
 *
 * @author Ángeles Bueno
 */


public class HorarioColores {
  public static void main(String[] args) {
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String azul = "\033[34m";
    String blanco = "\033[37m";
    String morado = "\033[35m";
    
    
    System.out.printf("%-20s %-20s %-20s %-20s %s\n", rojo + "Lunes", verde + "Martes", blanco + "Miércoles", azul + "Jueves", morado + "Viernes");
    System.out.printf("%-20s %-20s %-20s %-20s %s\n", azul + "Sistemas", rojo + "Programación", azul + "Sistemas", rojo + "Programación", rojo + "Programación");
    System.out.printf("%-15s %-15s %-15s %-15s %s\n", "Sistemas", "Programación", "Sistemas", "Programación", "Programación");
    System.out.printf("%-15s %-15s %-15s %-15s %s\n", "Sistemas", "Programación", "Sistemas", "Programación", "Entorno");
    System.out.printf("%-15s %-15s %-15s %-15s %s\n", "FOL", "BBDD", "Entorno", "BBDD", "Lenguaje");
    System.out.printf("%-15s %-15s %-15s %-15s %s\n", "FOL", "BBDD", "Entorno", "BBDD", "Lenguaje");
    System.out.printf("%-15s %-15s %-15s %-15s %s\n", "FOL", "BBDD", "Lenguaje", "BBDD", "Lenguaje");
  }
  



}
