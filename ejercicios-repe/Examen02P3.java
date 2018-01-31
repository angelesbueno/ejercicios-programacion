 /** @author Ángeles Bueno
  * 
  * Examen
  * 
 */
 
public class Examen02P3 {
  public static void main(String[] args) {
    
    long contadorCapicua = 0;
    long nuevoNumero = 0;
    boolean esCapicua = false;
    long aux = 0;
    long numeroIntroducido = 0;
    
    for (int i = 1; i<= 10; i++) {

      System.out.print("Introduce un número: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      aux = numeroIntroducido;
      
      while (numeroIntroducido > 0) {
      
        nuevoNumero = nuevoNumero + numeroIntroducido % 10;
        nuevoNumero = nuevoNumero * 10;
        numeroIntroducido /= 10;
      }
      nuevoNumero /= 10;
      
      if (nuevoNumero == aux) {
      contadorCapicua ++;
      }
      
      nuevoNumero = 0;
    
    }
    
    nuevoNumero /= 10;
    
    

    
    System.out.println("Ha introducido " + contadorCapicua + " número/s capicúa/s.");
  }
}

    
    

      
      


        
        
      
      
    
    
