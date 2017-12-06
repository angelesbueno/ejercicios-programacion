/**
 * 7. Arrays.
 *
 * 12.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio12 {
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
    System.out.println();
    System.out.println();
    System.out.print("Indique la posición inicial: ");
    int inicial = Integer.parseInt(System.console().readLine()); 
    System.out.print("Indique la posición final: ");
    int ultima = Integer.parseInt(System.console().readLine()); 
    System.out.println();
    
    //error de rango de array desde aquí
    
    if ((inicial < ultima) && ((inicial >= 0 && inicial <= 9) && (ultima >= 0 && ultima <= 9))) {
      
      for (int i = 0; i <= 9; i++) {

        numero[ultima] = auxiliar[inicial];
        numero[ultima + (i + 1)] = auxiliar[ultima];
        numero[ultima + (i + 2)] = auxiliar[ultima + (i + 1)];
        
        if (i == 9) {
            
          numero[0] = auxiliar[9];
        }
      }
    }
        
    
    System.out.println();  
    System.out.println("Serie nueva: ");
    System.out.println();
    System.out.print("Índice    ");
      
    for (int j = 0; j <= 10; j++) {
        
      System.out.print(j + "    ");
    }
    System.out.println();
    System.out.print("Valor     ");
    System.out.println();
    
    for (int k = 0; k <= 10; k++) {
      
      System.out.print(numero[k] + "    ");
    }
          
    
    
  }
}
