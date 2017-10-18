/**
 * 4. Sentencia condicional
 *
 * 4. Vamos a ampliar uno de los ejercicios de la relación anterior para 
 *    considerar las horas extras. Escribe un programa que calcule el salario 
 *    semanal de un trabajador teniendo en cuenta que las horas ordinarias 
 *    (40 primeras horas de trabajo) se pagan a 12 euros la hora. 
 *    A partir de la hora 41, se pagan a 16 euros la hora.
 *
 * @author Ángeles Bueno
 */


public class Ejercicio4 {
  public static void main(String[] args) {
    
    System.out.print("Escribe el total de horas semanales trabajadas: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    int sueldo;
    
    if (horas <= 40) {
      sueldo = horas*12;
    } else {
      sueldo = (40*12)+((horas-40)*16);
    }
    
    System.out.print("Tu sueldo semanal es de " + sueldo + "€.");
  }
}
  
    
    
      
    
  
