/**
 * 7. Arrays.
 *
 * 16. Escribe un programa que rellene un array de 20 elementos con números ente-
       ros aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
       el programa mostrará el array y preguntará si el usuario quiere resaltar los
       múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
       array escribiendo los números que se quieren resaltar entre corchetes.
 *
 * @author Ángeles Bueno
 */
 
public class DestacarMultiplosDeCincoOSiete {
  public static void main(String[] args) {
    
    int [] numero = new int[20];
    
    for (int i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random() * 401);
    }
    
    for (int i = 0; i < 20; i++) {
      System.out.print(numero[i] + " ");
    }
    System.out.println();
    System.out.println();
    System.out.print("¿Qué números quiere resaltar? (1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
    int eleccion = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.println();
    
    if (eleccion == 1) {
    
      for (int i = 0; i < 20; i++) {
        
        if (numero[i] % 5 == 0) {
          System.out.print("[" + numero[i] + "] ");
        } else {
          System.out.print(numero[i] + " ");
        }
      }
    } else {
      
      for (int i = 0; i < 20; i++) {
        
        if (numero[i] % 7 == 0) {
          System.out.print("[" + numero[i] + "] ");
        } else {
          System.out.print(numero[i] + " ");
        }
      }
    }
  }
}
