/**
 * 6. Números aleatorios.
 *
 * 23. Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
       Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio23 {
  public static void main(String[] args) {
    
    for(int i = 0; i < 5; i++) {
      
      int dadoNumero = ((int)(Math.random() * 6));
      String dado = "";
      
      switch (dadoNumero) {
        
        case 0:
          dado = "As";
          break;
          
        case 1:
          dado = "K";
          break;
          
        case 2:
          dado = "Q";
          break;
          
        case 3:
          dado = "J";
          break;
          
        case 4:
          dado = "8";
          break;
          
        case 5:
          dado = "7";
          break;
        
        default:
      }
      System.out.print(dado + " ");
    }
  }
}
      
      
