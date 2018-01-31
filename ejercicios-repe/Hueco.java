/**
 * 5. Bucles.
 *
 * Pintar cuadrado o rectángulo hueco
 *
 * @author Ángeles Bueno
 */
 
public class Hueco {
  public static void main(String[] args) {
  
  int alturaIntroducida = 5;
  int anchura = 7;
  int altura = 1;
  int espacios = anchura - 2;
  
  //anchura
  
  for(int i = 1; i <= anchura; i++) {
    System.out.print("*");
  }
  
  altura++;
  System.out.println();
  
  while(altura < alturaIntroducida) {
    System.out.print("*");
  
      for(int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      System.out.print("*");
      
      altura++;
      System.out.println();
    }
    
      altura++;
    
      for(int i = 1; i <= anchura; i++) {
      System.out.print("*");
    }
  }
}
    
      
      
        
        
    
    
  
  
  
