 /** Examen DAM 2.
 *
 * Ejercicio 1
 *
 * @author Ángeles Bueno
 */
 
public class Examen1 {
  public static void main(String[] args) {
    
    int [] numero = new int[20];
    int contadorPrimo = 0;
    
    for (int i = 0; i < 20; i++) {
      numero[i] = ((int)(Math.random() * 99) + 2);
      boolean esPrimo = true;
    
      for (int j = 2; j < numero[i]; j++) {
        if ((numero[i] % j) == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        contadorPrimo ++;
      }
    }
    int [] numeroPrimo = new int[contadorPrimo];
    int m = 0;
    int n = 0;
    do {
      
      boolean esPrimo = true;
    
      for (int j = 2; j < numero[n]; j++) {
        if ((numero[n] % j) == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        numeroPrimo[m] = numero[n];
        m++;
      }
      n++;
    
    } while (m < contadorPrimo);
    
    for (int i = 0; i < 20; i++) {
      System.out.print(numero[i] + " ");
    }
    
    if (contadorPrimo > 0) {
      System.out.println();
      System.out.println();
      System.out.print("Números primos encontrados: ");
      
      for(int i = 0; i < contadorPrimo; i++) {
        System.out.print(numeroPrimo[i] + " ");
      }
    } else {
      System.out.println();
      System.out.println();
      System.out.println("No se ha encontrado ningún número primo");
    }
  }
}
      
      
