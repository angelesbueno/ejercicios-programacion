/** 
  * 
 * @author Ángeles Bueno
 */
 
public class PiramideMaya {
  public static void main(String[] args) {
    
    System.out.print("Introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    int altura = 1;
    int espacios = alturaIntroducida - 1;
    int espaciosInternos = 4;
    int lineaAsteriscos = 6;
    int asteriscos = 2;
    
    while (altura <= alturaIntroducida) {
      
      //línea 1
        //espacios externos 
      
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
        //asteriscos
        
      for (int i = 1; i<= lineaAsteriscos; i++) {
        System.out.print("*");
      }
      
      lineaAsteriscos +=4;
      altura ++;
      espacios --;
      System.out.println();
      
      //línea 2
       
        //espacios externos
        
      if (altura <= alturaIntroducida) {
        
        for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
        }
        
        //asteriscos
        
        for (int i = 1; i<= asteriscos; i++) {
        System.out.print("*");
        }
      
        //espacios internos
        
        for (int i = 1; i <= espaciosInternos; i++) {
        System.out.print(" ");
        }
      
        //asteriscos derecha
        
        for (int i = 1; i<= asteriscos; i++) {
        System.out.print("*");
        }
      
        asteriscos +=2;
        altura ++;
        espacios --;
        System.out.println();
      
      }
    }
  }
}
      
    
