/**
 * 7. Arrays.
 *
 * 12.
 *
 * @author Ángeles Bueno
 */
 
public class IntercambiarYRotar {
  public static void main(String[] args) {
    
    int [] numero = new int[10];
    int [] auxiliar = new int[10];
    
    for (int i = 0; i < 10; i++) {
      
      System.out.print("Introduzca un número: ");
      numero[i] = Integer.parseInt(System.console().readLine());
      auxiliar[i] = numero[i];
    }
    
    System.out.println();  
    System.out.println("Serie original: ");
    System.out.println();
    System.out.print("Índice    ");
      
    for (int j = 0; j < 10; j++) {
        
      System.out.print(j + "    ");
    }
    System.out.println();
    System.out.print("Valor     ");
    
    for (int k = 0; k < 10; k++) {
      
      System.out.print(numero[k] + "    ");
    }
    
    //error de rango de array desde aquí
    boolean isCorrect = false;
    int inicial = 0;
    int ultima = 0;
    while (!isCorrect) {
      
      System.out.println();
      System.out.println();
      System.out.print("Indique la posición inicial: ");
      inicial = Integer.parseInt(System.console().readLine()); 
      System.out.print("Indique la posición final: ");
      ultima = Integer.parseInt(System.console().readLine()); 
      System.out.println();
      
      if ((inicial < ultima) && ((inicial >= 0 && inicial <= 9) && (ultima >= 0 && ultima <= 9))) {
        isCorrect = true;
      } else {
        System.out.print("Por favor, introduzca los datos adecuadamente.");
      }
      auxiliar[ultima] = numero[inicial];
      auxiliar[0] = numero[9];
        
      for (int i = 1; i <= inicial; i++) {

        auxiliar[i] = numero[i - 1];
      }
      
      for (int i = inicial + 1; i < ultima; i++) {
        auxiliar[i] = numero[i];
      }
      
      for (int i = ultima + 1; i < 10; i++) {
        auxiliar[i] = numero[i - 1];
      }
    }

    System.out.println();  
    System.out.println("Serie nueva: ");
    System.out.println();
    System.out.print("Índice    ");
      
    for (int j = 0; j < 10; j++) {
        
      System.out.print(j + "    ");
    }
    System.out.println();
    System.out.print("Valor     ");
    
    
    for (int k = 0; k < 10; k++) {
      
      System.out.print(auxiliar[k] + "    ");
    }
          
    
    
  }
}
