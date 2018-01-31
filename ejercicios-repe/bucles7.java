/**
 * 5. Bucles.
 *
 * 7.
 *
 * @author Ángeles Bueno
 */
 
public class bucles7 {
  public static void main(String[] args) {
    
    System.out.print("Introduce la combinación de la caja fuerte (4 cifras): ");
    int combiIntroducida = Integer.parseInt(System.console().readLine());
    
    int combiCorrecta = 2610;
    
    if (combiIntroducida == combiCorrecta) {
      System.out.print("La caja fuerte se ha abierto satisfactoriamente.");
      
    } else {
        
        for (int i = 4; i > 0; i--) {
          
          if ((i == 4) && (combiIntroducida != combiCorrecta)) {
            System.out.println("Lo siento, esa no es la combinación.");
            System.out.println("Te quedan 3 intentos.");
            combiIntroducida = Integer.parseInt(System.console().readLine());
          }
          
          if ((i == 3) && (combiIntroducida != combiCorrecta)) {
            System.out.println("Lo siento, esa no es la combinación.");
            System.out.println("Te quedan 2 intentos.");
            combiIntroducida = Integer.parseInt(System.console().readLine());
          }
          
          if ((i == 2) && (combiIntroducida != combiCorrecta)) {
            System.out.println("Lo siento, esa no es la combinación.");
            System.out.println("Te queda el último intento.");
            combiIntroducida = Integer.parseInt(System.console().readLine());
          }
          
          if ((i == 1) && (combiIntroducida != combiCorrecta)) {
            System.out.println("Lo siento, esa no es la combinación.");
            System.out.println("No te quedan más intentos, has bloqueado la caja fuerte.");
          }
          
          if (combiIntroducida == combiCorrecta) {
            System.out.print("La caja fuerte se ha abierto satisfactoriamente.");
            i = 0;
          }
            
        }
      }
    }
  }

