/**
 * 7. Arrays.
 *
 * 13. Escribe un programa que rellene un array de 100 elementos con números ente-
       ros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
       el programa mostrará el array y preguntará si el usuario quiere destacar el
       máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
       el número destacado entre dobles asteriscos.
 *
 * @author Ángeles Bueno
 */
 
public class DestacarMaximoOMinimo {
  public static void main(String[] args) {
    
    int [] numero = new int[100];
    int maximo = 0;
    int minimo = 600;
    
    for (int i= 0; i < 100; i++) {
      numero[i] = ((int)(Math.random() * 501));
      
      if (numero[i] > maximo) {
        maximo = numero[i];
      }
      
      if (numero[i] < minimo) {
        minimo = numero[i];
      }
    }
    
    for (int i= 0; i < 100; i++) {
      System.out.print(numero[i] + " ");
    }
    
    System.out.println();
    System.out.println();
    System.out.print("¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
    int eleccion = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    if (eleccion == 1) {
      
      for (int i= 0; i < 100; i++) {
        
        if (numero[i] == minimo) {
          System.out.print("**" + numero[i] + "** ");
          
        } else {
            System.out.print(numero[i] + " ");
          }
      }
      
    } else {
        for (int i= 0; i < 100; i++) {
        
          if (numero[i] == maximo) {
            System.out.print("**" + numero[i] + "** ");
            
          } else {
              System.out.print(numero[i] + " ");
            }
        }

      }
  }
}
