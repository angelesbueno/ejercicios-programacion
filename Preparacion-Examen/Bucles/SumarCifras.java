/**
 * Examen recuperación
 *
 * Sumar todas las cifras
 *
 * @author Ángeles Bueno
 */
 
public class SumarCifras {
  public static void main(String[] args) {
    
    int numeroIntroducido = 0;
    int auxiliar = 0;
    int suma = 0;
    
    System.out.print("Introduzca un número: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    auxiliar = numeroIntroducido;
    
    while (numeroIntroducido != 0) {
      suma += numeroIntroducido % 10;;
      numeroIntroducido /= 10;
    }
    
    System.out.print("Los dígitos del número " + auxiliar + " suman " + suma);
  }
}
    
    
