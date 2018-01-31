/**
 * 7. Arrays.
 *
 * 3. Escribe un programa que lea 10 números por teclado y que luego los muestre
      en orden inverso, es decir, el primero que se introduce es el último en
      mostrarse y viceversa.
 *
 * @author Ángeles Bueno
 */
 
public class MostrarALaInversa {
  public static void main(String[] args) {
    
    int [] numero = new int[10];
    
    for (int i = 9; i >= 0; i--) {
      
      System.out.print("Introduzca un número: ");
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    
    for (int j = 0; j < 10; j++) {
      System.out.print(numero[j] + " ");
    }
  }
}
