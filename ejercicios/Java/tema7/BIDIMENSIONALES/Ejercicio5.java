/**
 * 7. Arrays Bidimensionales.
 *
 * 5. Realiza un programa que rellene un array de 6 filas por 10 columnas con
      números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
      A continuación, el programa deberá dar la posición tanto del máximo como
      del mínimo.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio5 {
  public static void main(String[] args) {
    
    int [][] numero = new int[6][10];
    
    int fila = 0;
    int columna = 0;
    int maximo = 0;
    int minimo = 5000;
    int posicionMinimoFila = 0;
    int posicionMinimoColumna = 0;
    int posicionMaximoFila = 0;
    int posicionMaximoColumna = 0;
    
    for (fila = 0; fila < 6; fila ++) {
      for (columna = 0; columna < 10; columna ++) {
        numero[fila][columna] = ((int)(Math.random() * 1001));
        
        if (numero[fila][columna] < minimo) { 
          minimo = numero[fila][columna];
          posicionMinimoFila = fila;
          posicionMinimoColumna = columna;
        }
        if (numero[fila][columna] > maximo) { 
          maximo = numero[fila][columna];
          posicionMaximoFila = fila;
          posicionMaximoColumna = columna;
        }
      }
    }
    for (fila = 0; fila < 6; fila ++) {
      for (columna = 0; columna < 10; columna ++) {
        System.out.printf("%5d ", numero[fila][columna]);
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("El número mínimo es " + minimo + " y está en la fila " + (posicionMinimoFila + 1) + ", columna " + (posicionMinimoColumna + 1));
    System.out.println("El número máximo es " + maximo + " y está en la fila " + (posicionMaximoFila + 1) + ", columna " + (posicionMaximoColumna + 1));
  }
}

