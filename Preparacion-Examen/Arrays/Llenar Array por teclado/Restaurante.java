/**
 * 7. Arrays.
 *
 * 15. Restaurante - Mesas.
 *
 * @author Ángeles Bueno
 */
 
public class Restaurante {
  public static void main(String[] args) {
    
    int[] mesas = new int[11];
    int numMesaLibre = 0;
    int numMesaNoLibre = 0;
    
    for (int i = 1; i < 11; i++) {
      mesas[i] = ((int)(Math.random() * 4));
    }
    
    System.out.print("Mesa nº  ");
    
    for (int i = 1; i < 11; i++) {
      System.out.print("  " + i + " ");
    }
    
    System.out.println();
    System.out.println();
    System.out.print("Ocupación");
    
    for (int i = 1; i < 11; i++) {
      System.out.print("  " + mesas[i] + " ");
    }
    System.out.println();
    System.out.println();
    int comensales = 0;
    
    do {
      System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
      comensales = Integer.parseInt(System.console().readLine());
      boolean esLibre = false;
      
      if (comensales > 4) {
        
        System.out.println("Lo siento, no admitimos grupos de " + comensales + ", haga grupos de 4 personas como máximo e intente de nuevo. ");
        System.out.println();
        
      } else if (comensales == -1) {
      
      } else if ((comensales <= 4) && (comensales != -1)) {
        
        for (int i = 1; i < 11; i++) {
          if (mesas[i] == 0) {
            esLibre = true;
            numMesaLibre = i;
            mesas[i] += comensales;
            comensales = 0;
            i = 11;
          } else {
            numMesaLibre = 0;
          }
        }
        int ocupacion = 0;
        for (int i = 1; i < 11; i++) {
          if ((mesas[i] + comensales) <= 4) {
            mesas[i] += comensales;
            numMesaNoLibre = i;
            comensales = 0;
            i = 11;
            ocupacion = 1;
          } else {
            ocupacion = 0;
          }
            
        }
        
        if (esLibre) {
          System.out.println("Por favor, siéntense en la mesa número " + numMesaLibre + ".");
          System.out.println();
        } else if (ocupacion == 1) {
            System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + numMesaNoLibre + ".");
            System.out.println();
        } else {
          System.out.println("Lo siento, en estos momentos no queda sitio.");
          System.out.println();
        }
            
        System.out.print("Mesa nº  ");
    
        for (int i = 1; i < 11; i++) {
          System.out.print("  " + i + " ");
        }
        
        System.out.println();
        System.out.println();
        System.out.print("Ocupación");
        
        for (int i = 1; i < 11; i++) {
          System.out.print("  " + mesas[i] + " ");
        }
        System.out.println();
        System.out.println();
      }

    } while (comensales != -1);
  }
}
