/**
 * 7. Arrays Bidimensionales.
 *
 * 2. Escribe un programa que pida 20 números enteros. Estos números se deben
      introducir en un array de 4 filas por 5 columnas. El programa mostrará las
      sumas parciales de filas y columnas igual que si de una hoja de cálculo se
      tratara. La suma total debe aparecer en la esquina inferior derecha.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio2 {
  public static void main(String[] args) {
    
    System.out.println("Vaya introduciendo números y pulse [INTRO]: ");
    int numero [][] = new int[4][5];
    
    int fila = 0;
    int columna = 0;
    int sumaFila = 0;
    int sumaColumna = 0;
    int total = 0;
  
    for (fila = 0; fila < 4; fila ++) {
      for (columna = 0; columna < 5; columna ++) {
        numero[fila][columna] = Integer.parseInt(System.console().readLine());
      }
      columna = 0;
    }
    
    fila = 0;
    columna = 0;
    
    for (fila = 0; fila < 4; fila ++) {
      for (columna = 0; columna < 5; columna ++) {
        System.out.printf("%12d ", numero[fila][columna]);
        sumaFila += numero[fila][columna];
      }
      columna = 0;
      System.out.println("   ∑ fila " + fila + ": " + sumaFila);
      total += sumaFila;
      sumaFila = 0;
    }
    for (columna = 0; columna < 5; columna ++) {
      for (fila = 0; fila < 4; fila ++) {
        sumaColumna += numero[fila][columna];
      }
      System.out.print("∑ col " + columna + ": " + sumaColumna + "  ");
      
      sumaColumna = 0;
    }
    System.out.print(" ∑ Total: " + total);
    
  }
}
    
    
