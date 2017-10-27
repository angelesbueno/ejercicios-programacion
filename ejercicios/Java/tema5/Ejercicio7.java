/**
 * 5. Bucles.
 *
 * 7. Realiza el control de acceso a una caja fuerte. La combinación será un 
      número de 4 cifras. El programa nos pedirá la combinación para abrirla. 
      Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la 
      combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto 
      satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio7 {
  public static void main(String[] args) {
  
  
    int combiOk = 2610;
    int intentos = 4;
    int combi1;
    
    do {
      System.out.print("Introduce la combinación de la caja fuerte: ");
      combi1 = Integer.parseInt(System.console().readLine());
      
      if (combi1 == combiOk) {
        System.out.print("La caja fuerte se ha abierto satisfactoriamente.");
        
      } else {
          System.out.println("Lo siento, esa no es la combinación correcta");
          intentos--;
          System.out.println("Te quedan " + intentos + " intentos");
          
        }
    } while ((intentos > 0) && (combiOk !=combi1));
    
    if (intentos == 0) {
      System.out.println("Has bloqueado la caja fuerte, the police is coming...");
    }
      
  }
}
      
        
    
    
