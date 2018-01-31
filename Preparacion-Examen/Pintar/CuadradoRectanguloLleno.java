/**
 * 5. Bucles.
 *
 * Pintar cuadrado o rectángulo
 *
 * @author Ángeles Bueno
 */
 
public class CuadradoRectanguloLleno {
  public static void main(String[] args) {
  
    System.out.println("Vamos a pintar un cuadrado o un rectángulo");
    System.out.println("a raíz de una altura y una anchura introducida por teclado");
    
    System.out.print("Introduce la altura: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce la anchura: ");
    int anchura = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el símbolo que quieras pintar: ");
    String simb = System.console().readLine();
    
    int altura = 1;
    
    while (altura <= alturaIntroducida) {
      
      //anchura
      
      for (int i = 1; i <= anchura; i++) {
        System.out.print(simb);
      }
      
      
      //altura
      
      System.out.println();
      altura++;
    }
  }
}
       
      
      
