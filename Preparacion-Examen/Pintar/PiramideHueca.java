/**
 * 5. Bucles.
 *
 * Pirámide hueca
 *
 * @author Ángeles Bueno
 */
 
public class PiramideHueca {
  public static void main(String[] args) {
  
    System.out.print("Introduce una altura para la pirámide :"); 
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el caracter con el que quieres pintar la pirámide :"); 
    String caracter = System.console().readLine();
    
    int altura = 1;
    int espacios = alturaIntroducida - 1;
    int espaciosInternos = 1;
    int numeroCaracteres = 1;
    
    
    //espacios externos de la cúspide
    
    for (int i = 1; i <= espacios ; i++) {
      System.out.print(" ");
    }
    
    System.out.print(caracter);
    
    altura++;
    System.out.println();
    numeroCaracteres+=2;
    espacios--;
    
    while (altura < alturaIntroducida) {
      
      for (int i = 1; i <=espacios; i++) {
        System.out.print(" ");
      }
      
      System.out.print(caracter);
      
      for (int i = 1; i <= espaciosInternos; i++) {
        System.out.print(" ");
      }
      
      espaciosInternos+=2;
      
      System.out.print(caracter);
    
      altura++;
      System.out.println();
      numeroCaracteres+=2;
      espacios--;
    }
    
    //base
    
    for (int i = 1; i <= numeroCaracteres; i++) {
      System.out.print(caracter);
    }
      
    
  }
}
    
    
  
