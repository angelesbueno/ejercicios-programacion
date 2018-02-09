/**
 * 4. Sentencia condicional
 *
 * 1. Escribe un programa que pida por teclado un día de la semana y que diga 
 *    qué asignatura toca a primera hora ese día.
 *
 * @author Ángeles Bueno
 */

public class Ejercicio1 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un día de la semana: ");
    String dia = System.console().readLine().toLowerCase();
    
    boolean diaCorrecto = true;
    String asignatura;
    
    switch (dia) {
      case "lunes":
        asignatura = "Sistemas informáticos";
        break;
      
      case "martes":
        asignatura = "Programación";
        break;
        
      case "miércoles":
        asignatura = "Sistemas informáticos";
        break;
        
      case "jueves":
        asignatura = "Programación";
        break;
        
      case "viernes":
        asignatura = "Programación";
        break;
      
      default:
        asignatura = "No existe ese día";
        diaCorrecto = false;
        break;
    }
      if (diaCorrecto) {
    
        System.out.println("El " + dia + " toca a primera hora " + asignatura + ".");
      } else {
        System.out.println("No existe ese día");
      }
      
    
  }
}
      
      
