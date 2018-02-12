/**
 * 
 *
 * @author Ángeles Bueno
 */
 
import matematicas.Funciones;

public class Prueba {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número: ");
    int n = Integer.parseInt(System.console().readLine());
    System.out.print("Dime uno de los dígitos: ");
    int digito = Integer.parseInt(System.console().readLine());
    
    System.out.println(matematicas.Funciones.posicionDeDigito(n));
}
}
    
    
