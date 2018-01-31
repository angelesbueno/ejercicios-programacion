/**
 * Sentencia condicional
 *
 * Examen Factura.
 *
 * @author Ángeles Bueno
 */
 
public class ExamenFacturaCoche {
  public static void main(String[] args) {
    
    double precioBase = 0;
    String bateria = "";
    double bateriaNum = 0;
    String autonoma = "";
    double precioBateria = 0;
    double precioSinDesc = 0;
    double subvencion = 0;
    double total = 0;
    
    System.out.print("Seleccione el modelo de coche (a) Modelo 5 (b) Modelo 8: ");
    String modelo = System.console().readLine();
    
    if (modelo.equals("a")) {
      precioBase = 30000;
      System.out.print("Seleccione el tipo de batería (a) 50 kWh (b) 70 kWh: ");
      bateria = System.console().readLine();
      
      switch (bateria) {
        case "a":
          bateriaNum = 50;
          precioBateria = 50 * 125;
          precioSinDesc = precioBateria + 30000;
          break;
        case "b":
          bateriaNum = 70;
          precioBateria = 70 * 125;
          precioSinDesc = precioBateria + 30000;
          break;
        default:
      }
      subvencion = 5 * precioSinDesc / 100;
      total = precioSinDesc - subvencion;
      System.out.println();
      System.out.println("Gracias. Aquí tiene el presupuesto de su coche.");
      System.out.println("Ñesla Modelo 5");
      System.out.println("Precio base             " + precioBase + " €");
      System.out.println("Batería de " + (int)bateriaNum + "kWh       " + precioBateria + " €");
      System.out.println("Subvención estatal      -" + subvencion + " €");
      System.out.println("Total                   " + total + " €");
    } else {
      precioBase = 36000;
      System.out.print("Seleccione el tipo de batería (a) 80 kWh (b) 120 kWh: ");
      bateria = System.console().readLine();
      
      switch (bateria) {
        case "a":
          bateria = "80 kWh";
          bateriaNum = 80;
          precioBateria = 80 * 125;
          precioSinDesc = precioBateria + 36000;
          break;
        case "b":
          bateria = "120 kWh";
          bateriaNum = 120;
          precioBateria = 120 * 125;
          precioSinDesc = precioBateria + 36000;
          break;
        default:
      }
      subvencion = 5 * precioSinDesc / 100;
      total = precioSinDesc - subvencion;
      
      System.out.print("¿Quiere el paquete de conducción autónoma? (s/n): ");
      autonoma = System.console().readLine();
      
      if (autonoma.equals("s")) {
        precioSinDesc = precioBateria + 36000 + 1800;
        subvencion = 5 * precioSinDesc / 100;
        total = precioSinDesc - subvencion;
      }
      
      System.out.println();
      System.out.println("Gracias. Aquí tiene el presupuesto de su coche.");
      System.out.println("Ñesla Modelo 8");
      System.out.println("Precio base             " + precioBase + " €");
      System.out.println("Batería de " + (int)bateriaNum + "kWh       " + precioBateria + " €");
      if (autonoma.equals("s")) {
        System.out.println("Con conducción aut.      1800.0 €");
      } else {
        System.out.println("Sin conducción aut.         0.0 €");
      }
      System.out.println("Subvención estatal      -" + subvencion + " €");
      System.out.println("Total                   " + total + " €");
    }
  }
}
