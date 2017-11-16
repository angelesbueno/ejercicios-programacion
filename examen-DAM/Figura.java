/**
 * 5. Bucles.
 *
 * Examen, pregunta 3.
 *
 * @author Ángeles Bueno
 */
 
public class Figura {
  public static void main(String[] args) {
    
    System.out.print("Introduzca la altura (5 como mínimo): ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
    int espaciosInternos = Integer.parseInt(System.console().readLine());
    
    int altura = 1; //ascensor
    int espacios = 1;
    int espaciosLinea2 = alturaIntroducida - 1;
    
    System.out.println();
    
    // 3 primeras líneas
      
      // primer asterisco
    
    // línea 1
    System.out.print("*");
    
      // espacio/s entre el 1 y el 5
    
     
    for (int i = 1; i <= espaciosInternos; i++) {
      System.out.print(" ");
    }
    
    System.out.print("****");
    
    for (int i = 1; i <= espaciosInternos; i++) {
      System.out.print(" ");
    }
    
    System.out.print("****");
    
    altura++;
    System.out.println();
    
    // línea 2
    
    System.out.print("*");
    
    for (int i = 1; i <= espaciosInternos; i++) {
      System.out.print(" ");
    }
    
    System.out.print("*");
    
    
    for (int i = 1; i <= espaciosInternos; i++) {
      System.out.print(" ");
      }
      
    System.out.print("   ");
    System.out.print("*");
    System.out.print("   ");
    
    altura++;
    System.out.println();
    
    // línea 3
    
    System.out.print("*");
    
    for (int i = 1; i <= espaciosInternos; i++) {
      System.out.print(" ");
    }
    
    System.out.print("****");
    
    for (int i = 1; i <= espaciosInternos; i++) {
      System.out.print(" ");
    }
    
    System.out.print("****");
    
    altura++;
    System.out.println();
    
    
    // parte cambiante
    
    while (altura < alturaIntroducida) {
      
      System.out.print("*");
      
      for (int i = 1; i <= espaciosInternos; i++) {
      System.out.print(" ");
      }
      
      System.out.print("   ");
      System.out.print("*");
    
      for (int i = 1; i <= espaciosInternos; i++) {
      System.out.print(" ");
      }
      
      System.out.print("   ");
      System.out.print("*");
      
    altura++;
    System.out.println();
   
    }
    
    System.out.print("*");
    
    for (int i = 1; i <= espaciosInternos; i++) {
      System.out.print(" ");
    }
    
    System.out.print("****");
    
    for (int i = 1; i <= espaciosInternos; i++) {
      System.out.print(" ");
    }
    
    System.out.print("****");
    
  }
}
    

      
        
        
        
  
