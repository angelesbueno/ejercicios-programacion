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
    
    int [] numero = new int[11];
    int [] numeroAuxiliar = new int[11];
    
    for (int i = 0; i < 10; i++) {
      numero[i] = (int)(Math.random() * 101);
      numeroAuxiliar[i] = numero[i];
    }
    
    for (int i = 0; i < 10; i++) {
      System.out.print(numero[i] + " ");
    }
    System.out.println();
    System.out.print("Escoge uno de los números mostrados anteriormente: ");
    int eleccion = Integer.parseInt(System.console().readLine());
    
    for (int i = 0; i < 10; i++) {
      if (eleccion == numero[i]) {
        numeroAuxiliar[0] = numero[i];
        numeroAuxiliar[i + 1] = numeroAuxiliar[i + 2];
        /**numeroAuxiliar[1] = numero[0];
        numeroAuxiliar[2] = numero[1];
        numeroAuxiliar[3] = numero[2];
        numeroAuxiliar[4] = numero[3];
        numeroAuxiliar[5] = numero[4];
        numeroAuxiliar[6] = numero[5];
        numeroAuxiliar[7] = numero[6];
        numeroAuxiliar[8] = numero[7];
        numeroAuxiliar[9] = numero[8];
        //numeroAuxiliar[i + 1] = */
      }
    }
    System.out.println();
    System.out.println();
    for (int i = 0; i < 10; i++) {
      System.out.print(numeroAuxiliar[i] + " ");
    }
  }
}
