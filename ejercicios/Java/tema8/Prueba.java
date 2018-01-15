/**
 * 
 *
 * @author Ángeles Bueno
 */
 
import matematicas.Funciones;

public class Prueba {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    if (matematicas.Funciones.esCapicua(numeroIntroducido)) {
      System.out.println("El número " + numeroIntroducido + " es capicúa.");
    } else {
      System.out.println("El número " + numeroIntroducido + " no es capicúa.");
    }
  }
}
