/**
 * Examen recuperación
 *
 * Cifra mayor, cifra menor
 *
 * @author Ángeles Bueno
 */
 
public class CifraMayorYMenor {
  public static void main(String[] args) {
    
    int numeroIntroducido = 0;
    int digito = 0;
    int maximo = 0;
    int minimo = 999;
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    while (numeroIntroducido != 0) {
      digito = numeroIntroducido % 10;
      if (digito < minimo) { 
        minimo = digito;
      }
      if (digito > maximo) { 
        maximo = digito;
      }
      numeroIntroducido /= 10;
    }
    System.out.println("Menor: " + minimo);
    System.out.println("Mayor: " + maximo);
  }
}
