/**
 * 7. Arrays.
 *
 * 17. Escribe un programa que muestre por pantalla un array de 10 números enteros
       generados al azar entre 0 y 100. A continuación, el programa debe pedir
       un número al usuario. Se debe comprobar que el número introducido por
       teclado se encuentra dentro del array, en caso contrario se mostrará un
       mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario
       introduzca uno correctamente. A continuación, el programa rotará el array
       hacia la derecha las veces que haga falta hasta que el número introducido
       quede situado en la posición 0 del array. Por último, se mostrará el array rotado
       por pantalla.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio17 {
  public static void main(String[] args) {
    
    int [] numero = new int[10];
    
    for (int i = 0; i < 10; i++) {
      numero[i] = (int)(Math.random() * 101);
    }
    
    for (int i = 0; i < 10; i++) {
      System.out.print(numero[i] + " ");
    }
  }
}
