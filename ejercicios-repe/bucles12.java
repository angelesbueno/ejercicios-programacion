/**
 * 5. Bucles.
 *
 * 12. Escribe un programa que muestre los n primeros términos de la serie de 
 *     Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo 
 *     es 1 y el resto se calcula sumando los dos anteriores, por lo que 
 *     tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 
 *     89, 144... El número n se debe introducir por teclado.
 *
 * @author Ángeles Bueno
 */
 
public class bucles12 {
  public static void main(String[] args) {
    
    System.out.print("¿Cuántos números de la serie de Fibonacci quieres que te muestre?: ");
    int veces = Integer.parseInt(System.console().readLine());
    
    int primerTer = 0;
    int segundoTer = 1;
    int tercerTer = primerTer + segundoTer;
    
    if (veces == 1) {
      System.out.println("El primer término de la serie de Fibonacci es 0.");
    }
    
    if (veces == 2) {
      System.out.println("Los" + veces + " primeros términos de la serie de Fibonacci son: 0 1");
    }
    
    if (veces > 2) {
      System.out.print("0 1 ");
      
      
      for ( int contador = veces - 2; contador > 0; contador--) { // 5
        System.out.print(tercerTer + " ");
        primerTer = segundoTer;
        segundoTer = tercerTer;
        tercerTer = primerTer + segundoTer;
      }
    }
      
  }
}
  

        
      
  
    
      
      
