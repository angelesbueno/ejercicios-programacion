/**
 * Examen Turno 1.
 *
 * Ejercicio 3.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio3 {
  public static void main(String[] args) {
    
    int espacios = 0;
    int virgen = 0;
    int sanJose = 0;
    int nino = 0;
    
    // no varía
    System.out.println("   * * * * * * *");
    System.out.println("   *           *");
    System.out.print("   *");
    
    nino = ((int)(Math.random() * 5) + 1);
    virgen = ((int)(Math.random() * (nino - 5)) + 1);
    sanJose = ((int)(Math.random() * (nino - 5)) + nino);
    
    
    for (int i = 1; i <= 6; i++) {
      System.out.print(" ");
      if ((i == virgen) && (virgen < nino) && (virgen > sanJose)) {
        System.out.print("V");
        System.out.print(" ");
      }
      if ((i == nino) && (nino > virgen) && (nino < sanJose)) {
        System.out.print("o");
        System.out.print(" ");
      }
      if ((i == sanJose) && (sanJose > nino) && (sanJose > virgen)) {
        System.out.print("S");
        System.out.print(" ");
      }
      System.out.print(" ");
    }
    System.out.print("*");
    System.out.println();
    System.out.println("-------------------");
  }
}
        
      
      
