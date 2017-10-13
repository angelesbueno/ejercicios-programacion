/**
 * 3. Lectura de datos desde teclado
 *
 * 8. Escribe un programa que calcule el salario semanal de un empleado en base 
 *    a las horas trabajadas, a razón de 12 euros la hora.
 *
 * @author Ángeles Bueno
 */


public class Ejercicio8 {
  public static void main(String[] args) {
    System.out.print("Escribe el total de horas semanales trabajadas:");
    double horas = Double.parseDouble(System.console().readLine());
    System.out.print("Tu salario semanal es de " + (horas*12) + "€");
  }
}
