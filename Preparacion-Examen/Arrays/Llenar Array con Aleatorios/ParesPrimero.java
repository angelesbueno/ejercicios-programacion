/**
 * 7. Arrays.
 *
 * 10. Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
      y que los almacene en un array. El programa debe ser capaz de pasar todos
      los números pares a las primeras posiciones del array (del 0 en adelante) y
      todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
      es necesario.
 *
 * @author Ángeles Bueno
 */
 
public class ParesPrimero {
  public static void main(String[] args) {
    
    int [] numero = new int[20];
    int contadorPar = 0;
    int contadorImpar = 0;
    
    for (int i = 0; i < 20; i++) {
      
      numero[i] = ((int)(Math.random() * 101));
      
      if (numero[i] % 2 == 0) {
        contadorPar ++;
      } else {
          contadorImpar ++;
      }
    }
    
    int [] numeroPar = new int[contadorPar];
    int [] numeroImpar = new int[contadorImpar];
    
    System.out.println("Serie original:");
    
    for (int i = 0; i < 20; i++) {
      System.out.print(numero[i] + " ");
    }
    
    System.out.println();
    
    int j = 0;
    int i = 0;
    
    do {
      
      if (numero[i] % 2 == 0) {
        
        numeroPar[j] = numero[i];
        j++;
      
      }
      i++;
      
    } while (j < contadorPar);
    
    j = 0;
    i = 0;
    
    do {
      
      if (numero[i] % 2 != 0) {
        
        numeroImpar[j] = numero[i];
        j++;
      
      }
      i++;
      
    } while (j < contadorImpar);
    System.out.println();
    System.out.println("Serie ordenada (primero los pares y después los impares) :");

    for (int k = 0; k < contadorPar; k++) {
      System.out.print(numeroPar[k] + " ");
    }
    
    for (int l = 0; l < contadorImpar; l++) {
      System.out.print(numeroImpar[l] + " ");
    }
  }
}
