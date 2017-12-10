 /** Examen DAM 2.
 *
 * Ejercicio 4.
 *
 * @author Ángeles Bueno
 */
 
public class Examen4 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int anchuraIntroducida = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    int altura = 0;
    int alturaMedia = alturaIntroducida - 2;
    int espacios = anchuraIntroducida - 2;
    int anchuraPez = ((int)(Math.random() * espacios) + 1);
    int alturaPez = ((int)(Math.random() * alturaMedia) + 1);
    int anchuraCaracola = ((int)(Math.random() * espacios) + 1);
    int alturaCaracola = ((int)(Math.random() * alturaMedia) + 1);
    int anchuraCaballito = ((int)(Math.random() * espacios) + 1);
    int alturaCaballito = ((int)(Math.random() * alturaMedia) + 1);


    while (altura <= alturaIntroducida) {
    
      for (int i = 1; i <= anchuraIntroducida; i++) {
          
          System.out.print("*");
      }

      altura ++;
      System.out.println();
      
        while (altura <= alturaMedia) {
          
          System.out.print("*");
          int q = 0;
          int k = 0;
          for (int j = 1; j <= espacios; j++) {
            
            if ((j == anchuraPez) && (altura == alturaPez)) {
              
              System.out.print("&");
             
            }else if ((j == anchuraCaracola) && (altura == alturaCaracola)) {
              
              System.out.print("@");

             
            }else if ((j == anchuraCaballito) && (altura == alturaCaballito)) {
              
              System.out.print("$");
            
            } else {
              
              System.out.print(" "); 
            }
            q ++;
            k ++;
          }
          
          System.out.print("*");
          System.out.println();
          altura ++;
        }
      altura ++;  
    }
  }
}
