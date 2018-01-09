 /** 
  * Ejercicio 1.
  * 
  * 09/01/2018
  * Recuperación DAW Primer Trimestre
  * 
  * @author Ángeles Bueno Aguilar
 */
 
public class Ex04aba1 {
  public static void main(String[] args) {
    
    double precioBase = 0;
    double nataNum = 0;
    double total = 0;
    String tamanoPalabra = "";
    String tipoPalabra = "";
    
    System.out.print("Seleccione el tamaño del roscón - 1.Pequeño  2.Mediano 3.Grande: ");
    int tamano = Integer.parseInt(System.console().readLine());
    System.out.print("Elija el tipo - 1.Normal  2.De chocolate: ");
    int tipo = Integer.parseInt(System.console().readLine());
    System.out.print("¿Quiere nata? (s/n): ");
    String nata = System.console().readLine();
    System.out.print("¿Quiere la versión light? (s/n): ");
    String light = System.console().readLine();
    double lightNum = 0;
    
    switch (tipo) {
      case 1:
        tipoPalabra = "normal";
        if (tamano == 1) {
          precioBase = 8;
          tamanoPalabra = "pequeño";
        }
        if (tamano == 2) {
          precioBase = 10;
          tamanoPalabra = "mediano";
        }
        if (tamano == 3) {
          precioBase = 14;
          tamanoPalabra = "grande";
        }
        break;
      case 2:
        tipoPalabra = "de chocolate";
        if (tamano == 1) {
          precioBase = 10;
          tamanoPalabra = "pequeño";
        }
        if (tamano == 2) {
          precioBase = 13;
          tamanoPalabra = "mediano";
        }
        if (tamano == 3) {
          precioBase = 16;
          tamanoPalabra = "grande";
        }
        break;
      default:
    }
    
    if (nata.equals("s")) {
      nataNum = 10 * precioBase / 100;
    }
    
    total = precioBase + nataNum;
    
    if (light.equals("s")) {
      lightNum = total;
    }
    System.out.println();
    System.out.println("Gracias. Aquí tiene su ticket.");
    System.out.println("Roscón "+ tamanoPalabra + " " + tipoPalabra + "           " + precioBase + " €");
    
    if (nata.equals("s")) {
      System.out.println("Con nata                              " + nataNum + " €");
    }
      
    if (light.equals("s")) {
      System.out.println("Versión light                        " + lightNum + " €");
    }
    
    System.out.println("Total                                " + (total + lightNum) + " €");
  }
}
