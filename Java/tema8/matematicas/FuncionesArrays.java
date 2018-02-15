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
public class FuncionesArrays {
  
  /**
   * Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
   * @param n número entero que indica el tamaño del array
   * @param min número entero que indica el intervalo mínimo del array
   * @param max número entero que indica el intervalo máximo del array
   * @return      array generado
   */
  public static int[] generaArrayInt(int n, int min, int max) {
    
    int[] x = new int[n]; 
    
    for (int i = 0; i < n; i++) {
      x[i] = ((int)(Math.random() * (max - min + 1)) + min);
    }
    return x;
  }
  /**
  * Muestra un array previamente generado
  * @param x array de una dimensión de números enteros
  */  
  public static void muestraArrayInt(int x[]) {
  
  for (int n : x) {
      System.out.print(n + " ");
    }
    System.out.println("");
  }
  /**
   * Devuelve el número más pequeño de todos los que hay en un array
   * @param x array de una dimensión de números enteros
   * @return el número más pequeño del array que se pasa como parámetro
   */  
  public static int minimoArrayInt(int[] x) {
    
    int minimo = Integer.MAX_VALUE;
    
    for (int n : x) {
      if (n < minimo) {
        minimo = n;
      }
    }
    return minimo;
  }
  /**
   * Devuelve el número máyor de todos los que hay en un array
   * @param x array de una dimensión de números enteros
   * @return el número máximo (número más grande) del array que se pasa como parámetro
   */  
  public static int maximoArrayInt(int[] x) {
    
    int maximo = Integer.MIN_VALUE;
    
    for (int n : x) {
      if (n > maximo) {
        maximo = n;
      }
    }
    return maximo;
  }
  /**
   * Devuelve la media del array 
   * @param x array de una dimensión de números enteros
   * @return la media del array que se pasa como parámetro
   */  
  public static double mediaArrayInt(int[] x) {
    
    double suma = 0;
    double media = 0;
    
    for (int i = 0; i < x.length; i++) {
      suma += x[i];
    }
    media = suma / x.length;
    return media; 
  }
  /**
   * Dice si un número está dentro de un array o no
   * @param x array de una dimensión de números enteros
   * @param num número entero que se pasa por parámetro para saber si está dentro del array o no
   */
  public static void estaEnArray(int[] x, int num) {
    
    boolean estaEnArray = false;
    
    for (int n : x) {
      if (n == num) {
        estaEnArray = true;
      }   
    }
    if (estaEnArray) {
      System.out.println("El número " + num + " sí se encuentra en el array");
    } else {
      System.out.println("El número " + num + " no se encuentra en el array");
    }
  }
  /**
   * Dice si un número está dentro de un array o no
   * @param x array de una dimensión de números enteros
   * @param num número entero que se pasa por parámetro para saber en qué posición está en el array
   * @return la posición del número
   */
  public static int posicionEnArray(int[] x, int num) {
    
    int posicion = 0;
    
    for (int i = 0; i < x.length; i++) {
      
      if (x[i] == num) {
        posicion = i;
      }
      
    }
    return posicion;
  }
  
  
  
}
