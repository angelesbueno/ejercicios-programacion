/** @author Ángeles Bueno
  * 
  * Capicúa
  * 
 */
 
public class Capicua2 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca un número entero positivo: "); 
    long numeroIntroducido = Integer.parseInt(System.console().readLine());
    long aux = numeroIntroducido;
    
    long nuevoNumero = 0;
    boolean esCapicua = false;
    
    while (numeroIntroducido > 0) {
      
      nuevoNumero = nuevoNumero + numeroIntroducido % 10;
      nuevoNumero = nuevoNumero * 10;
      numeroIntroducido /= 10;
      
    }
    
    
    nuevoNumero /= 10;
    
    
    if(aux == nuevoNumero) {
      esCapicua = true;
      System.out.println("Es capicúa");
    } else{
        esCapicua = false;
        System.out.println("No es capicúa");
      }
    
    
  }
}
  
  
  
