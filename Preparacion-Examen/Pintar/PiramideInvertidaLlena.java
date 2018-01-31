 /** @author Ángeles Bueno
  * 
  * Pirámide Invertida Rellena
  * 
 */
 
public class PiramideInvertidaLlena {
  public static void main(String[] args) {
    
    
    System.out.print("Introduce la altura de la pirámide invetida: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    int altura = 1;
    int espacios = 1;
    int asteriscos = alturaIntroducida + (alturaIntroducida - 1);
    
    System.out.println();
    
    while (altura <= alturaIntroducida) {
      
      for (int i = 1; i < espacios ; i++) { 
        System.out.print(" ");
      }
      
      espacios++;
      
      
      for (int i = 1; i <= asteriscos; i++) {
        System.out.print("*");
      }
      
      altura ++;
      System.out.println();
      asteriscos -= 2; 
    
    }
    
    
    
  }
}
      
      
       
    
    
    
    
  
  
