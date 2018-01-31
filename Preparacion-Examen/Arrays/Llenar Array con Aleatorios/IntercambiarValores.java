/**
 * 7. Arrays.
 *
 * 7. Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
      muestre por pantalla separados por espacios. El programa pedirá entonces
      por teclado dos valores y a continuación cambiará todas las ocurrencias del
      primer valor por el segundo en la lista generada anteriormente. Los números
      que se han cambiado deben aparecer entrecomillados.
 *
 * @author Ángeles Bueno
 */
 
public class IntercambiarValores {
  public static void main(String[] args) {
    
    int [] numero = new int[100];
    
    for (int i = 0; i < 100; i++) {
      
      numero[i] = ((int)(Math.random() * 21));
      System.out.print(numero[i] + " ");
    }
    
    System.out.println();
    System.out.println();
    System.out.print("Indique el número que quiere sustituir: ");
    int numeroAntiguo = Integer.parseInt(System.console().readLine()); 
    System.out.print("Indique el número por el que quiere sustituir el valor indicado anteriormente: ");
    int numeroNuevo = Integer.parseInt(System.console().readLine()); 
    System.out.println();
    
    for (int i = 0; i < 100; i++) {
      
      if (numero[i] == numeroAntiguo) {
        
        numero[i] = numeroNuevo;
        System.out.print("'" + numero[i] + "' ");
        
      } else {
        
          System.out.print(numero[i] + " ");
        }
    }
  }
}

    
    
