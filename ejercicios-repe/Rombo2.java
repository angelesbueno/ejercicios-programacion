/** @author Ángeles Bueno
  * 
  * Rombo2
  * 
 */
 
public class Rombo2 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número : "); 
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    int alturaMedia = (alturaIntroducida - 1) / 2;
    int altura = 1;
    int espacios = alturaMedia;
    int asteriscos = 1;
    
    while (altura <= alturaMedia) {
      
      for (int i = 1; i <= espacios; i++) {
      System.out.print(" ");
      
      }
      
      for (int i = 1; i <= asteriscos; i++) {
        System.out.print("*");
      }
        
      
      System.out.println();
      altura ++;
      asteriscos +=2;
      espacios --;
    
    }

    for (int i = 1; i <= asteriscos; i++) {
      System.out.print("*");
    }
    
    asteriscos -=2;
    altura ++;
    System.out.println();
    espacios++;
    
    
    
    /**System.out.print(altura); //5
    System.out.print(alturaMedia); //3
    System.out.print(espacios); //0*/
    
    while (altura <= alturaIntroducida) {
      
      for (int i = 1; i <= espacios; i++) {
      System.out.print(" ");
      
      }
      
      for (int i = 1; i <= asteriscos; i++) {
        System.out.print("*");
      }
        
      
      System.out.println();
      altura ++;
      asteriscos -=2;
      espacios ++;
    }
    
    
  }
}
     
