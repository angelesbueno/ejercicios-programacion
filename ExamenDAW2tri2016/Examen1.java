 /** Examen DAM 2.
 *
 * Muestra por pantalla una secuencia aleatoria de 10 números múltiplos de 7 comprendidos entre el 140
   y el 210 ambos incluidos.
 *
 * @author Ángeles Bueno
 */
 
public class Examen1 {
  public static void main(String[] args) {
    
    int [] numero = new int[10];
    int i = 0;
    int numeroAleatorio = 0;
    
    do {
      
      numeroAleatorio = ((int)(Math.random() * 71) + 140);
      if (numeroAleatorio % 7 == 0) {
        numero[i] = numeroAleatorio;
        i ++;
      }
    } while (i < 10);
    
    for (int j = 0; j < 10; j++) {
      System.out.print(numero[j] + " ");
    }
  }
}
    
