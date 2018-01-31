/**
 * 7. Arrays.
 *
 * 8. Realiza un programa que pida la temperatura media que ha hecho en cada mes
      de un determinado año y que muestre a continuación un diagrama de barras
      horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
      de asteriscos o cualquier otro carácter.
 *
 * @author Ángeles Bueno
 */
 
public class TemperaturaYBarras {
  public static void main(String[] args) {
    
    int [] mes = new int[12];
    
    for (int i = 0; i < 12; i++) {
      
      System.out.print("Indique la temperatura media del mes " + (i + 1) + " de 2017: ");
      mes[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println();
    System.out.println("Enero");
    
    for (int i = 0; i < mes[0]; i++) {
      System.out.print("*");
    }
    System.out.println(" " + mes[0]);
    System.out.println();
    
    System.out.println("Febrero");
    
    for (int i = 0; i < mes[1]; i++) {
      System.out.print("*");
    }
    System.out.println(" " + mes[1]);
    System.out.println();
    
    System.out.println("Marzo");
    
    for (int i = 0; i < mes[2]; i++) {
      System.out.print("*");
    }
    System.out.println(" " + mes[2]);
    System.out.println();
    
    System.out.println("Abril");
    
    for (int i = 0; i < mes[3]; i++) {
      System.out.print("*");
    }
    System.out.println(" " + mes[3]);
    System.out.println();  
    
    System.out.println("Mayo");
    
    for (int i = 0; i < mes[4]; i++) {
      System.out.print("*");
    }
    System.out.println(" " + mes[4]);
    System.out.println(); 
    
    System.out.println("Junio");
    
    for (int i = 0; i < mes[5]; i++) {
      System.out.print("*");
    }
    System.out.println(" " + mes[5]);
    System.out.println(); 
    
    System.out.println("Julio");
    
    for (int i = 0; i < mes[6]; i++) {
      System.out.print("*");
    }
    System.out.println(" " + mes[6]);
    System.out.println();
    
    System.out.println("Agosto");
    
    for (int i = 0; i < mes[7]; i++) {
      System.out.print("*");
    }
    System.out.println(" " + mes[7]);
    System.out.println();
    
    System.out.println("Septiembre");
    
    for (int i = 0; i < mes[8]; i++) {
      System.out.print("*");
    }
    System.out.println(" " + mes[8]);
    System.out.println();
    
    System.out.println("Octubre");
    
    for (int i = 0; i < mes[9]; i++) {
      System.out.print("*");
    }
    System.out.println(" " + mes[9]);
    System.out.println();
    
    System.out.println("Noviembre");
    
    for (int i = 0; i < mes[10]; i++) {
      System.out.print("*");
    }
    System.out.println(" " + mes[10]);
    System.out.println();
    
    System.out.println("Diciembre");
    
    for (int i = 0; i < mes[11]; i++) {
      System.out.print("*");
    }
    System.out.println(" " + mes[11]);
    System.out.println();
  }
}
      
