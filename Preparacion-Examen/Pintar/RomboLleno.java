 /** @author Ángeles Bueno
  * 
  * Rombo
  * 
 */
 
public class RomboLleno {
  public static void main(String[] args) {
  
   
    System.out.print("Introduce la altura del rombo (impar): ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine()); 
    
    int altura = 1;
    int asteriscos = 1;
    int alturaMedia = (alturaIntroducida - 1) / 2;
    int espacios = alturaMedia;
    
    System.out.println();
    
      //Pirámide normal
      
    while (altura <= alturaMedia) {
      
      for (int i = 1; i <= espacios; i++) {
      System.out.print(" ");
      }
      
      for (int i = 1; i <= asteriscos; i++) {
      System.out.print("*");
      }
  
      altura++;
      System.out.println();
      espacios--;
      asteriscos+=2;
    }
    
    //Base intermedia
        
      for (int i = 1; i <= alturaIntroducida; i++) {
        System.out.print("*");
      }
      
      asteriscos -= 2;
      altura++;
      System.out.println();
      espacios++;
    
    //Pirámide invertida
    
    while (altura <= alturaIntroducida) {
    
      for (int i = 1; i <= espacios ; i++) { 
        System.out.print(" ");
      }
      
      
      
      for (int i = 1; i <= asteriscos; i++) {
        System.out.print("*");
      }
      
      altura ++;
      System.out.println();
      asteriscos -= 2; 
      alturaMedia ++;
      espacios ++;
      
    }
    
  }
}

      
      

      
        
