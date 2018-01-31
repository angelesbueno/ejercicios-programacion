 /** @author Ángeles Bueno
  * 
  * examen1
  * 
 */
 
public class Examen01P1 {
  public static void main(String[] args) {
    
    int numeroIntroducido = 0;
    int contadorCapicua = 0;
    int nuevoNumero = 0; //volteado
    
    System.out.print("Por favor, vaya introduciendo números y pulsando [INTRO]: ");
    
    while (numeroIntroducido >= 0) {

      numeroIntroducido = Integer.parseInt(System.console().readLine());
      int aux = numeroIntroducido;
      
      if (numeroIntroducido > 0) {
        nuevoNumero = 0;
        
        while (numeroIntroducido > 0) {
      
          nuevoNumero = nuevoNumero + numeroIntroducido % 10;
          nuevoNumero = nuevoNumero * 10;
          numeroIntroducido /= 10;
        }
        nuevoNumero /= 10;
        
        
        if (nuevoNumero == aux) {
          contadorCapicua++;
        
        }

      }
    }
    System.out.println("Ha introducido " + contadorCapicua + " números capicúas.");
  }
}

      
       
      
      


        
        
      
      
    
    
    
    
    
