/**
 * 
 *
 * @author Ángeles Bueno
 */
 
import matematicas.Funciones;

public class Prueba {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.print("Dime un dígito: ");
    int digito = Integer.parseInt(System.console().readLine());
    int posicion = -1;
    int noEncuentra = 0;
    int volteado = matematicas.Funciones.voltea(numero);
    System.out.print(volteado);
    while (volteado > 0) {
      if (volteado % 10 == digito) {
        volteado = 0;
        posicion ++;
      } else {
      noEncuentra ++;
      }
      volteado /= 10;
    }
    
    if (noEncuentra == 0) {
      System.out.print(-1);
    } else {
    System.out.println(posicion);
    }
  }
}
  
    
      
      
    
    
