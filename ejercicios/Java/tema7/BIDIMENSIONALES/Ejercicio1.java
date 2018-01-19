/**
 * 7. Arrays Bidimensionales.
 *
 * 1. Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio1 {
  public static void main(String[] args) {
    
    int [][] numero = new int[3][6];
    
    numero [0][1] = 30;
    numero [0][2] = 2;
    numero [0][5] = 5;
    numero [1][0] = 75;
    numero [2][2] = -2;
    numero [2][3] = 9;
    numero [2][5] = 11;
    
    int fila = 0;
    int columna = 0;
    
    System.out.println("Array num  Columna 0  Columna 1  Columna 2  Columna 3  Columna 4  Columna 5");
    
    for (fila = 0; fila < 3; fila ++) {
      System.out.print("Fila " + fila);
      for (columna = 0; columna < 6; columna ++) {
        System.out.printf("%10d ", numero[fila][columna]);
      }
      System.out.println();
    }
  }
}
         
      
    
