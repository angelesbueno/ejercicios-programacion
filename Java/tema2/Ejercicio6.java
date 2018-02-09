/**
 * 2. Variables.
 *
 * 6. Escribe un programa que calcule el total de una factura a partir de la 
 *    base imponible (precio sin IVA). La base imponible estará almacenada 
 *    en una variable.
 *
 * @author Ángeles Bueno
 */



public class Ejercicio6 {
  public static void main(String [] args) {
    
    double baseImponible = 340000;
    
    System.out.printf("Base imponible %10.2f\n", + baseImponible);
    System.out.printf("IVA            %10.2f\n", + (0.21*baseImponible));
    System.out.println("==========================");
    System.out.printf("               %10.2f\n", + (0.21*baseImponible + baseImponible));
    
  }
}
  
  
