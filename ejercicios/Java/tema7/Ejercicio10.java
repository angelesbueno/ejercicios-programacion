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
 
public class Ejercicio10 {
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
    
    for (int i = 0; i < contadorPar; i++) {
      System.out.print(numeroPar[i] + " ");
    }
    
    for (int i = 0; i < contadorImpar; i++) {
      System.out.print(numeroImpar[i] + " ");
    }
  }
}

// me da todo 0, revisar;
    
    
