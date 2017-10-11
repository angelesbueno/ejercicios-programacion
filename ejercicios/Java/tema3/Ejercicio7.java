public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.print("Escribe la base imponible:");
    double baseImponible = Double.parseDouble(System.console().readLine());
    System.out.print("Escribe el % de IVA:");
    double iva = Double.parseDouble(System.console().readLine());
    double totalFactura = ((iva/100*baseImponible) + baseImponible);
    System.out.print("El total de la factura es " + totalFactura + "€");

  }
}
    
