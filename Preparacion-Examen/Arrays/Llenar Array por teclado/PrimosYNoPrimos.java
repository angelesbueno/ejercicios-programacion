/**
 * 7. Arrays.
 *
 * 11. Realiza un programa que pida 10 números por teclado y que los almacene en
       un array. A continuación se mostrará el contenido de ese array junto al índice
       (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
       primos a las primeras posiciones, desplazando el resto de números (los que
       no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
       el array resultante.
 *
 * @author Ángeles Bueno
 */
 
public class PrimosYNoPrimos {
  public static void main(String[] args) {
    
    int [] numero = new int[15];
    int contadorPrimo = 0;
    int contadorNoPrimo = 0;
    
    for (int i = 0; i < 10; i++) {
      
      System.out.print("Introduzca un número: ");
      numero[i] = Integer.parseInt(System.console().readLine());
    }

    System.out.println();  
    System.out.println("Serie original: ");
    System.out.println();
    System.out.print("Índice    ");
      
    for (int j = 0; j < 10; j++) {
        
      System.out.print(j + "    ");
    }
    System.out.println();
    System.out.print("Valor     ");
    
    for (int k = 0; k < 10; k++) {
      
      System.out.print(numero[k] + "    ");
    }
    
    
    for (int i = 0; i < 10; i++) {
      
      boolean esPrimo = true;
    
      for (int j = 2; j < numero[i]; j++) {
        if ((numero[i] % j) == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        contadorPrimo ++;
      } else {
        contadorNoPrimo ++;
      }
    }
    System.out.println();
    System.out.println(contadorPrimo);
    System.out.println(contadorNoPrimo);
    
    int [] numeroPrimo = new int [contadorPrimo];
    int [] numeroNoPrimo = new int [contadorNoPrimo];
    
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
    
    m = 0;
    n = 0;
    
    do {
      
      boolean esPrimo = true;
    
      for (int j = 2; j < numero[n]; j++) {
        if ((numero[n] % j) == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo == false) {
        numeroNoPrimo[m] = numero[n];
        m++;
      }
      n++;
    
    } while (m < contadorNoPrimo);
    
    System.out.println();  
    System.out.println("Serie ordenada (primero los primos y después los no primos): ");
    System.out.println();
    System.out.print("Índice    ");
      
    for (int j = 0; j < 10; j++) {
        
      System.out.print(j + "    ");
    }
    System.out.println();
    System.out.print("Valor     ");
    
    for (int k = 0; k < contadorPrimo; k++) {
      
      System.out.print(numeroPrimo[k] + "    ");
    }
    
    for (int r = 0; r < contadorNoPrimo; r++) {
      
      System.out.print(numeroNoPrimo[r] + "    ");
    }
  }
}
