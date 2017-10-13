/**
 * 3. Lectura de datos desde teclado
 *
 * 12. Realiza un programa que calcule la nota que hace falta sacar en el 
 *     segundo examen de la asignatura Programación para obtener la media deseada. 
 *     Hay que tener en cuenta que la nota del primer examen cuenta el 40% y 
 *     la del segundo examen un 60%.
 *
 * @author Ángeles Bueno
 */


public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.print("Escribe la nota del primer examen:");
    double primerExamen = Double.parseDouble(System.console().readLine());
    System.out.print("¿Qué nota quieres sacar en el trimestre?:");
    double notaFinal = Double.parseDouble(System.console().readLine());
    double segundoExamen = ((notaFinal * 100) - (primerExamen * 40)) / 60;
    System.out.print("Para tener un " + notaFinal + " en el trimestre necesitas sacar un " + segundoExamen + " en el segundo examen.");
  }
}
    
    
    
