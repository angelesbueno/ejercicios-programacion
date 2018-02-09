/**
 * 6. Números aleatorios.
 *
 * 13. Escribe un programa que simule la tirada de dos dados. El programa deberá
       continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
       dados tengan el mismo valor.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio13 {
  public static void main(String[] args) {
    
    int dado1 = 0;
    int dado2 = 0;
    String dibujoDado = "";
    String dibujoDado2 = "";
   
    do {
      
      dado1 = ((int)(Math.random() * 6) + 1);
      dado2 = ((int)(Math.random() * 6) + 1);
      
      switch (dado1) {
        
        case 1:
          dibujoDado = "⚀ ";
          break;
          
        case 2:
          dibujoDado = "⚁ ";
          break;
        
        case 3:
          dibujoDado = "⚂ ";
          break;
        
        case 4:
          dibujoDado = "⚃ ";
          break;
        
        case 5:
          dibujoDado = "⚄ ";
          break;
        
        case 6:
          dibujoDado = "⚅ ";
          break;
        
        default:
      }  
      
      switch (dado2) {
        
        case 1:
          dibujoDado2 = "⚀ ";
          break;
          
        case 2:
          dibujoDado2 = "⚁ ";
          break;
        
        case 3:
          dibujoDado2 = "⚂ ";
          break;
        
        case 4:
          dibujoDado2 = "⚃ ";
          break;
        
        case 5:
          dibujoDado2 = "⚄ ";
          break;
        
        case 6:
          dibujoDado2 = "⚅ ";
          break;
        
        default:
      }      

      System.out.println("Dado 1: " + dado1 + " " + dibujoDado);
      System.out.println("Dado 2: " + dado2 + " " + dibujoDado2);
      System.out.println();
          
    } while (dado1 != dado2);
  }
}

