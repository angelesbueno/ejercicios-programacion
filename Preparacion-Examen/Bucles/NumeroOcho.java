/**
 * Examen recuperación
 *
 * Números terminados en 8
 *
 * @author Ángeles Bueno
 */
 
public class NumeroOcho {
  public static void main(String[] args) {
    
    int contadorNumeroOcho = 0;
    int numeroIntroducido = 0;
    int digito = 0;
    
    System.out.println("Por favor, vaya introduciendo números y pulsando [INTRO]: ");
    
    do {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      if (numeroIntroducido != 0) {
        digito = numeroIntroducido % 10;
        
        if (digito == 8) {
        contadorNumeroOcho ++;
        }
      }
    } while (numeroIntroducido != 0);
    
    if (contadorNumeroOcho == 0) {
        System.out.println("Ha introducido 0 números terminados en 8");
    
    } else {
      System.out.println("Ha introducido " + contadorNumeroOcho + " número terminados en 8.");
    }
  }
}
