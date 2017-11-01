/**
 * 5. Bucles.
 *
 * 13. Escribe un programa que lea una lista de diez números y determine 
       cuántos son positivos, y cuántos son negativos.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio13 {
  public static void main(String[] args) {
  
    System.out.println("Introduce diez números: ");
    
    int negativos = 0;
    int positivos = 0; 
    
    for(int num = 0; num < 10; num++) {
      if(Integer.parseInt(System.console().readLine()) < 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
    
    System.out.println("Has introducido " + positivos + " números positivos y " + negativos + " números negativos.");
  }
}
    
        
        
    
    
