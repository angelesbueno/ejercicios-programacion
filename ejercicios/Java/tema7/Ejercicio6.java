/**
 * 7. Arrays.
 *
 * 6. Escribe un programa que lea 15 números por teclado y que los almacene en un
      array. Rota los elementos de ese array, es decir, el elemento de la posición 0
      debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
      la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
      del array.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio6 {
  public static void main(String[] args) {
    
    int [] numero = new int[15];
    int [] auxiliar = new int [15];
    
    for (int i = 0; i < 15; i++) {
      
      System.out.print("Introduzca un número: ");
      numero[i] = Integer.parseInt(System.console().readLine());    
    }
    
    for (int i = 0; i < 14; i++) {
      auxiliar[i + 1] = numero[i];
    }
    
    auxiliar[0] = numero[14];
    
    for (int j = 0; j < 15; j++) {
      
      System.out.print(numero[j] + " ");
    }
    
    System.out.println();
    
    for (int k = 0; k < 15; k++) {
      
      System.out.print(auxiliar[k] + " ");
    }
  }
}
    
      
    
    
