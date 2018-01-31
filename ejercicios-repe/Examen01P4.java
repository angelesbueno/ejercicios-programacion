 /** @author Ángeles Bueno
  * 
  * examen1
  * 
 */
 
public class Examen01P4 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca un número: ");
    long numeroIntroducido = Integer.parseInt(System.console().readLine());
    long numeroComplementario = 0;
    long volteado = 0; //nuevoNumero
    
    while (numeroIntroducido > 0) {
      
      while (numeroIntroducido > 0) {
        
        
        volteado = volteado + (9 - numeroIntroducido % 10);
        //System.out.println(volteado);
        //volteado = 9 - volteado;
        //System.out.println(volteado);
        volteado = volteado * 10;
        //System.out.println(volteado);
        numeroIntroducido /= 10;
        //System.out.println(numeroIntroducido);
        
      }
      volteado /= 10;

    }

    while (volteado > 0) {
        
      numeroComplementario = (numeroComplementario * 10) + (volteado % 10);

      volteado /= 10;
    }

    
    System.out.println("El número complementario es " + numeroComplementario);
    
  }
}
