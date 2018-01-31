 /** @author Ángeles Bueno
  * 
  * Dislocar un número
  * 
 */
 
public class Dislocar {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número : "); 
    long numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    long numeroNuevo = 0;
    long volteado = 0;
    
    
    while (numeroIntroducido >= 1) {
      
      long digito = numeroIntroducido % 10;
      
      if (digito % 2 == 0) {
        
        digito ++;
        numeroNuevo = numeroNuevo + digito;
        numeroNuevo = numeroNuevo * 10;
        
      
      } else {
          digito --;
          numeroNuevo = numeroNuevo + digito;
          numeroNuevo = numeroNuevo * 10;
          
        }
    
      numeroIntroducido /= 10;
    
    }
    
    numeroNuevo /= 10;
    
    //volteado
    
    while (numeroNuevo > 0) {
        
    volteado = (volteado * 10) + (numeroNuevo % 10);

    numeroNuevo /= 10;
    
    
    }
    
    System.out.println(volteado);
  }
  
  
}
    
        
        
        
          
        
        
        
    
    
      
      
  
