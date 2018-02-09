/**
 * 7. Arrays Bidimensionales.
 *
 * 3. Modifica el programa anterior de tal forma que los números que se introducen
      en el array se generen de forma aleatoria (valores entre 100 y 999).
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio3 {
  public static void main(String[] args) {
    
    int numero [][] = new int[4][5];
    
    int fila = 0;
    int columna = 0;
    int sumaFila = 0;
    int sumaColumna = 0;
    int total = 0;
  
    for (fila = 0; fila < 4; fila ++) {
      for (columna = 0; columna < 5; columna ++) {
        numero[fila][columna] = ((int)(Math.random() * 900) + 100);
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
