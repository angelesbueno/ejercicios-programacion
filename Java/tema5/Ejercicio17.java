/**
 * 5. Bucles.
 *
 * 17. Realiza un programa que sume los 100 números siguientes a un número 
       entero y positivo introducido por teclado. Se debe comprobar que el 
       dato introducido es correcto (que es un número positivo).
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio17 {
  public static void main(String[] args) {
    
    int suma = 0;
    int numeroIntroducido = 0;
    
    System.out.print("Introduce un número entero y positivo: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine()); 
    
    if (numeroIntroducido < 0) {
      
      System.out.print("Ese número no es correcto, debe ser un número positivo.");
      
    } else {
      
        for (int i = numeroIntroducido + 1; i <= numeroIntroducido + 101; i++) {
          
          suma += i;
        
        }
        
      System.out.print("La suma de los 100 números siguientes a " + numeroIntroducido + " es: " + suma); 
      
      }
      
     
     
  
  }
  
}
          
          
          
          
      
