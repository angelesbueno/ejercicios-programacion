 /** 
  * Ejercicio 4
  * 
  * @author Ángeles Bueno
 */
 
public class Ex04aba4 {
  public static void main(String[] args) {
    
    int numeroAleatorio = 0;
    int contadorMelchor = 0;
    int contadorGaspar = 0;
    int contadorBaltasar = 0;
    int contadorPasos = 2;
    int espaciosMelchor = 0;
    int espaciosGaspar = 0;
    int espaciosBaltasar = 0;
    
    System.out.println("Paso 1   -------P");
    System.out.println(" Melchor:M"); // 1
    System.out.println("  Gaspar:G"); // 2
    System.out.println("Baltasar:B"); // 3
    
    System.out.println();
    
    do {
      numeroAleatorio = ((int)(Math.random() * 3) + 1);
      
      switch(numeroAleatorio) {
        case 1:
          contadorMelchor ++;
          espaciosMelchor ++;
          break;
          
        case 2:
          contadorGaspar ++;
          espaciosGaspar ++;
          break;
          
        case 3:
          contadorBaltasar ++;
          espaciosBaltasar ++;
          break;
        
        default:
      }
      
      System.out.println("Paso " + contadorPasos + "   -------P");
      
      System.out.print(" Melchor:");
      
      for (int i = 0; i < espaciosMelchor; i++) {
        System.out.print(" "); 
      }
      System.out.print("M");
      System.out.println();
      System.out.print("  Gaspar:");
      
      for (int i = 0; i < espaciosGaspar; i++) {
        System.out.print(" "); 
      }
      System.out.print("G");
      System.out.println();
      System.out.print("Baltasar:"); 
      
      for (int i = 0; i < espaciosBaltasar; i++) {
        System.out.print(" "); 
      }
      System.out.print("B");
      System.out.println();
      System.out.println();
      
      contadorPasos ++ ;
    
    } while((espaciosMelchor < 8) && (espaciosGaspar < 8) && (espaciosBaltasar < 8));
    
    if (espaciosMelchor == 8) {
      System.out.print("¡Ha ganado Melchor!");
      
    } else if (espaciosGaspar == 8) {
      System.out.print("¡Ha ganado Gaspar!");
    } else if (espaciosBaltasar == 8) {
      System.out.print("¡Ha ganado Baltasar!");
    }
  }
}
