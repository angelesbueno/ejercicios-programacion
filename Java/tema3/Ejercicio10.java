/**
 * 3. Lectura de datos desde teclado
 *
 * 10. Realiza un conversor de Mb a Kb.
 *
 * @author Ángeles Bueno
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.print("Escribe la cantidad de MB que quieres convertir a KB:");
    double mb = Double.parseDouble(System.console().readLine());
    System.out.println( + mb + "MB son " + (mb*1024) + "KB");
  }
}
    
