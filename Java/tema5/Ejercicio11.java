/**
 * 5. Bucles.
 *
 * 11. Escribe un programa que muestre en tres columnas, el cuadrado y el cubo 
 *     de los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio11 {
  public static void main(String[] args) {
    
    int contador = 0;
    
    System.out.print("Introduce un número entero: ");
    int num = Integer.parseInt(System.console().readLine());
    
    do {
      System.out.println("");
      System.out.println("Número           Número(2)                   Número(3)");
      System.out.println(num + "                     " + num * num + "                          " + num * num * num);
      contador++;
      num++;
      
    
    } while (contador < 5);
  }
}
    
      
    
    
