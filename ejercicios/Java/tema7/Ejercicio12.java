/**
 * 7. Arrays.
 *
 * 12.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio12 {
  public static void main(String[] args) {
    
    int [] numero = new int[10];
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
    
    System.out.print("Indique la posición inicial: ");
    int inicial = Integer.parseInt(System.console().readLine()); 
    System.out.print("Indique la posición final: ");
    int ultima = Integer.parseInt(System.console().readLine()); 
    System.out.println();
    
    if ((inicial < ultima) && (inicial >= 0 && ultima >= 0)) {
    }
    
  }
}
