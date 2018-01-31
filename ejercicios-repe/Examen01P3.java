 /** @author Ángeles Bueno
  * 
  * examen1
  * 
 */
 
public class Examen01P3 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca el número de escalones: ");
    int escalonesIntroducido = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la altura de cada escalón: ");
    int alturaEscalonIntroducida = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    String anchuraEscalones = "****";
    int altura = 1; //ascensor
    
    while (altura <= escalonesIntroducido) {
      
      for (int i = 1; i <= alturaEscalonIntroducida; i++) {
        System.out.println(anchuraEscalones);
      }
      
      anchuraEscalones += "****";
      altura ++;
      
    }
  }
}
        
    
    
    
  
