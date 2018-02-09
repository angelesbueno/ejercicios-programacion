/**
 * 6. Números aleatorios.
 *
 * 5. Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) 
      separados por espacios. Muestra también el máximo, el mínimo y la media de esos números.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio5 {
  public static void main(String[] args) {
    
    int max = 0;
    int min = 300;
    int suma = 0;
    int media = 0;
    
    
    for(int i = 0; i < 50; i++) {
      
      int numero = 0;
      
      numero = ((int)(Math.random()*100) + 100);
      System.out.print(numero + " ");
      
      suma += numero;
      
      if (numero < min) {
        
        min = numero;
      }
      
      if (numero > max) {
        
        max = numero;
      }
      
    }
    System.out.println();
    System.out.println();
    System.out.println("Máximo: " + max);
    System.out.println("Mínimo: " + min);
    System.out.println("Media: " + suma / 50);
  }
}
