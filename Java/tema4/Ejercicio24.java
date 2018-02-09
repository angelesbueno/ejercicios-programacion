/**
 * 4. Sentencia condicional
 *
 * 24. Nómina.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio24 {
  public static void main(String[] args) {
    
    double sueldoBase = 0;
    int retencion = 0;
    double retencionTotal = 0;
    
    System.out.println("1 - Programador Junior");
    System.out.println("2 - Programador Senior");
    System.out.println("3 - Jefe de Proyecto");
    System.out.print("Introduzca el cargo del empleado: ");
    int cargo = Integer.parseInt(System.console().readLine());
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
    double diasViaje = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    System.out.println();
    double dietas = 30 * diasViaje;
    
    switch (cargo) {
      case 1:
        sueldoBase = 950;
        break;
      case 2:
        sueldoBase = 1200;
        break;
      case 3:
        sueldoBase = 1600;
        break;
      default:
    }
    
    switch (estadoCivil) {
      case 1:
        retencion = 25;
        break;
      case 2:
        retencion = 20;
      default:
    }
    System.out.println("----------------------------------");
    System.out.println("- Sueldo Base             " + sueldoBase + " -");
    System.out.println("- Dietas (" + (int)diasViaje + " viajes)        " + dietas + " -");
    System.out.println("----------------------------------");
    System.out.println("- Sueldo Bruto            " + (sueldoBase + dietas) + " -");
    System.out.println("- Retención IRPF (" + retencion + "%)     " + (retencion * (sueldoBase + dietas) / 100) + " -");
    System.out.println("----------------------------------");
    System.out.println("- Sueldo Neto             " + ((sueldoBase + dietas) - (retencion * (sueldoBase + dietas) / 100)) + " -");
    System.out.println("----------------------------------");
  }
}
    
    
    
    
