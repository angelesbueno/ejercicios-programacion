/**
 * 5. Bucles.
 *
 * 8.
 *
 * @author Ángeles Bueno
 */
 
public class bucles8 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero positivo y te diré su tabla de multiplicar: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    for (int i = 0; i < 11; i++) {
      
      System.out.println(numero + "x" + i + "=" + numero * i);
    }
  }
}
      
      
    
    
