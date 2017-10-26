/**
 * 5. Bucles.
 *
 * 6. Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio6 {
  public static void main(String[] args) {
  
  int i = 320;
  
  do {
    System.out.println(i);
      i-=20;
    } while ((i <= 320) && (i >=160));
  }
}
