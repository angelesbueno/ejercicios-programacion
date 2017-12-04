/**
 * 6. Números aleatorios.
 *
 * 24. Escribe un programa que, dado un número introducido por teclado, elija al azar
       uno de sus dígitos.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio24 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int digito = 0;
    
    while (numeroIntroducido >= 1) {
        
      digito = (digito * 10) + (numeroIntroducido % 10);
        
      numeroIntroducido /= 10;
    }
    
    System.out.println(digito);
    System.out.println(numeroIntroducido);
    //incompleto
  }
}
    

      
      
    
    
