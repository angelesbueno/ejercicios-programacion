 /** @author Ángeles Bueno
  * 
  * Examen
  * 
 */
 
public class Examen02P1 {
  public static void main(String[] args) {
    
    String tipoServicio = "";
    int basico = 0; //200 al mes *10
    int estandar = 0; //500 al mes *25
    int premium = 0; //800 al mes *40
    int numGb = 0;
    
    System.out.print("Introduce el tipo de servicio (1: básico; 2: estándar; 3: premium): ");
    tipoServicio = System.console().readLine();
    
    System.out.print("Introduce número de gigabytes que se han transferido durante el mes: ");
    numGb = Integer.parseInt(System.console().readLine());
    
    
    if (tipoServicio.equals ("1")) {
      if (numGb <= 40) {
        basico = 200;
      
      } else {
          basico = ((numGb - 40) * 10) + 200;
        }
    }
    
    if (tipoServicio.equals ("2")) {
      if (numGb <= 40) {
        estandar = 500;
      
      } else {
          estandar = ((numGb - 40) * 25) + 500;
        }
    }
    
    if (tipoServicio.equals ("3")) {
      if (numGb <= 40) {
        estandar = 800;
      
      } else {
          estandar = ((numGb - 40) * 40) + 800;
        }
    }
    
    int total = basico + estandar + premium;
    
    System.out.print("El coste mensual del servicio de almacenamiento en la nube es de: " + total); 
    
  }
}
    
    
    
      
    
    
