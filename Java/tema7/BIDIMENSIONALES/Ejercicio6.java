/**
 * 7. Arrays Bidimensionales.
 *
 * 6. Modifica el programa anterior de tal forma que no se repita ningún número en
      el array.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio6 {
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
// falta hacer que no se repita

