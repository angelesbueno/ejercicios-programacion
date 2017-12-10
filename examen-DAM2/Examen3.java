 /** Examen DAM 2.
 *
 * Ejercicio 3.
 *
 * @author Ángeles Bueno
 */
 
public class Examen3 {
  public static void main(String[] args) {
    
    int [] original = new int[15];
    int contadorCinco = 0;
    
    for (int i = 0; i < 15; i++) {
      original[i] = ((int)(Math.random() * 501));
      if (original[i] % 5 == 0) {
        contadorCinco ++;
      }
    }
    int [] cincuerizado = new int[15];
    
    for (int i = 0; i < 15; i++) {
      if (original[i] % 5 == 0) {
        cincuerizado[i] = original[i];
      
      } else {
        int numero = original[i];
        
        do {
          numero ++;
        } while (numero % 5 != 0);
        cincuerizado[i] = numero;
      }
    }
    System.out.println("Array original: ");
    
    for (int i = 0; i < 15; i++) {
      System.out.print(original[i] + " ");
    }
    System.out.println();
    System.out.println();
    System.out.println("Array cincuerizado: ");
    for (int i = 0; i < 15; i++) {
      System.out.print(cincuerizado[i] + " ");
    }
  }
}
