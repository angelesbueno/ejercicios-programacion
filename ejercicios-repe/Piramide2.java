/**
 * 5. Bucles.
 *
 * Pintar una pirámide
 // los espacios a dibujar antes del primer caracter siempre será altura -1
 *
 * @author Ángeles Bueno
 */
 
public class Piramide2 {
  public static void main(String[] args) {
  
  int alturaIntroducida = 5;
  int altura = 1;
  int espacios = alturaIntroducida - 1;
  int asteriscos = 1;
  
  while (altura <= alturaIntroducida) {
    
  // pintamos los espacios antes del primer asterisco
  
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
  }
}
    
      
    
  
