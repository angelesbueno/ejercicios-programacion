/**
 * 3. Lectura de datos desde teclado
 *
 * 7. Escribe un programa que calcule el total de una factura a partir de 
 *    la base imponible.
 *
 * @author Ángeles Bueno
 */


public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.print("Escribe la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    System.out.print("Escribe el % de IVA: ");
    double iva = Double.parseDouble(System.console().readLine());
    double totalFactura = ((iva/100*baseImponible) + baseImponible);
    System.out.println("------------------------");
    //System.out.print("El total de la factura es " + totalFactura + "€");
    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA            %8.2f\n", iva);
    System.out.println("------------------------");
    System.out.printf("Total          %8.2f€\n", totalFactura);
  }
}
    
