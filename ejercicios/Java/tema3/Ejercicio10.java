/**Conversor de MB a KB
 **/

public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.print("Escribe la cantidad de MB que quieres convertir a KB:");
    double mb = Double.parseDouble(System.console().readLine());
    System.out.println( + mb + "MB son " + (mb*1024) + "KB");
  }
}
    
