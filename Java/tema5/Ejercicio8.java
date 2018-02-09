/**
 * 5. Bucles.
 *
 * 8. Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio8 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero y te diré su tabla de multiplicar: ");
    int num1 = Integer.parseInt(System.console().readLine());
    
    for (int num = 0; num < 11; num++) {
      System.out.println(num1+ " x " + num + " = " + (num1 * num));
    }
  }
}
