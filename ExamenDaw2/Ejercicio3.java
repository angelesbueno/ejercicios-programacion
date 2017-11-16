 /** Examen DAW 2.
 *
 * Ejercicio 3
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio3 {
  public static void main(String[] args) {
  
    int alturaLineas = 4;
    int altura = 1; //ascensor
    int numLineas = 1;
    int espacios = 1;
    int asteriscos = 1;
    
    System.out.print("Introduce el número de líneas: ");
    numLineas = Integer.parseInt(System.console().readLine()); 
    
    if (numLineas !=1) {
      
      System.out.print("¿Cuántos espacios quiere entre cada línea?: ");
      espacios = Integer.parseInt(System.console().readLine());
      
    }
    
    System.out.println();
    
    if (numLineas == 1) {
      System.out.println("*");
      System.out.println("*");
      System.out.println("*");
      System.out.println("*");
    
    } else {
   
        while (altura <= alturaLineas) { // 1   4
          
          for (int j = 1; j <= numLineas; j++) {    // 3  
 
            System.out.print("*");
          
            for (int i = 1; i <= espacios; i++) {
              System.out.print(" ");
            }
          
          }
          
          altura ++;
          System.out.println();
        

        }
      }
  }
}
  

      
      
