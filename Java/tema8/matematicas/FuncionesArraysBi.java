/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class FuncionesArraysBi {
  /**
   * Genera un array bidimensional de tamaño f x c con números aleatorios 
   * cuyo intervalo (mínimo y máximo) se indica como parámetro.
   * @param f número entero que indica el tamaño de las filas del array
   * @param c número entero que indica el tamaño de las columnas del array
   * @param min número entero que indica el intervalo mínimo del array
   * @param max número entero que indica el intervalo máximo del array
   * @return array generado
   */
  public static int[][] generaArrayBiInt(int f, int c, int min, int max) {
    
    int[][] x = new int[f][c];
    
    int fila = 0;
    int columna = 0;
    
    for (fila = 0; fila < f; fila ++) {
      for (columna = 0; columna < c; columna ++) {
        x[fila][columna] = ((int)(Math.random() * ((max - min) + 1) + min));
      }
    }
    return x;
  }
  /**
   * Genera un array bidimensional de tamaño f x c con números aleatorios 
   * @param f número entero que indica el tamaño de las filas del array
   * @param c número entero que indica el tamaño de las columnas del array
   * @return array generado
   */
  public static int[][] generaArrayBiIntSinMaximoNiMinimo(int f, int c) {
    
    int[][] x = new int[f][c];
    
    int fila = 0;
    int columna = 0;
    
    for (fila = 0; fila < f; fila ++) {
      for (columna = 0; columna < c; columna ++) {
        x[fila][columna] = ((int)(Math.random() * 10));
      }
    }
    return x;
  }
  /**
   * Muestra un array bidimensional previamente generado que se pasa por parámetro
   * @param x array bidimiensional de números enteros
   * @param f número de filas que tiene el array bidimensional
   * @param c número de columnas que tiene el array bidimensional
   */
  public static void muestraArrayBi(int x[][], int f, int c) {
    int fila, columna;
    
      for (fila = 0; fila < f; fila++) {
        System.out.print("Fila: " + fila);
        for (columna = 0; columna < c; columna++) {
          System.out.printf("%10d ", x[fila][columna]);
          //Thread.sleep(1000); // retardo de un segundo
        }
        System.out.println();
      }
    }
  /**
   * Devuelve la fila i-ésima del array que se pasa como
     parámetro.
   * @param x array bidimiensional de números enteros
   * @param f número de filas que tiene el array bidimensional
   * @param c número de columnas que tiene el array bidimensional
   * @param nFila número de fila del que se quieren extraer los números
   * @return los números de la fila metidos en un array de una dimensión
   */
  public static int[] filaDeArrayBiInt(int x[][], int f, int c, int nFila) {
    
    int fila, columna;
    int[] y = new int[c];
    
    for (fila = 0; fila < f; fila++) {
      for (columna = 0; columna < c; columna ++) {
        if (fila == nFila) {
          y[fila] = x[fila][columna]; 
        }
      }
    }// no sale; revisar
    return y;
  }
  
}
  
