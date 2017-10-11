/**Conversor de KB a MB
 **/

public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.print("Escribe la cantidad de KB que quieres convertir a MB:");
    double kb = Double.parseDouble(System.console().readLine());
    System.out.println( + kb + "KB son " + (kb/1024) + "MB");
  }
}
