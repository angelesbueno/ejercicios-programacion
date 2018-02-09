/**
 * 7. Arrays Bidimensionales.
 *
 * 4. Modifica el programa anterior de tal forma que las sumas parciales y la suma
      total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
      que el ordenador se queda “pensando” antes de mostrar los números.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio4 {
  public static void main(String[] args)
    throws InterruptedException { // Se añade esta línea para poder usar sleep
    
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
      Thread.sleep(1000); // retardo de un segundo
      total += sumaFila;
      sumaFila = 0;
    }
    for (columna = 0; columna < 5; columna ++) {
      for (fila = 0; fila < 4; fila ++) {
        sumaColumna += numero[fila][columna];
      }
      System.out.print("∑ col " + columna + ": " + sumaColumna + "  ");
      Thread.sleep(1000); // retardo de un segundo
      
      sumaColumna = 0;
    }
    System.out.print(" ∑ Total: " + total);
    Thread.sleep(1000); // retardo de un segundo
  }
}
