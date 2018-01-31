/**
 * 6. Números aleatorios.
 *
 * 19. Escribe un programa que muestre 50 números enteros aleatorios comprendi-
       dos entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
       luego el máximo de los pares el mínimo de los impares y la media de todos los
       números generados.
 *
 * @author Ángeles Bueno
 */
 
public class MaximoParMinimoImparYMedia {
  public static void main(String[] args) {
  
    int suma = 0;
    int maximoPar = 0;
    int minimoImpar = 250;
    
    
    for (int i = 0; i < 50; i++) {

      int numero = ((int)(Math.random() * 301) + (-100));
      System.out.print((numero) + " ");
      
      suma += numero;
      
      if (numero % 2 == 0) {
        
        if (numero > maximoPar) {
          maximoPar = numero;
        }
        
      } else {
        
          if (numero < minimoImpar) {
            minimoImpar = numero;
          }
        }
            

    }
    
    System.out.println();
    System.out.println();
    System.out.println("Máximo número par: " + maximoPar);
    System.out.println("Mínimo número impar: " + minimoImpar);
    System.out.println("Media de todos los números: " + (suma / 50));

  }
}
