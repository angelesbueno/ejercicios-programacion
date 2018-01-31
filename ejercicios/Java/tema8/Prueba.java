/**
 * 
 *
 * @author Ángeles Bueno
 */
 
import matematicas.Funciones;

public class Prueba {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.print("Dime la posición inicial: ");
    int digitoIni = Integer.parseInt(System.console().readLine());
    System.out.print("Dime la posición final: ");
    int digitoFin = Integer.parseInt(System.console().readLine());
    int numeroDef = 0;
    
    int volteado = matematicas.Funciones.voltea(numero);
    
    for (int i = 0; i <= digitoIni; i++) {
      volteado /= 10;
    }
    System.out.println(volteado);
    numeroDef = matematicas.Funciones.voltea(volteado);
    
    for (int i = 0; i < digitoFin; i++) {
      numeroDef /= 10;
    }
    System.out.println(numeroDef);
  }
}
