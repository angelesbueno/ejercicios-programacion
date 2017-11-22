/**
 * 6. Números aleatorios.
 *
 * 9. Realiza un programa que vaya generando números aleatorios pares entre 0
      y 100 y que no termine de generar números hasta que no saque el 24. El
      programa deberá decir al final cuántos números se han generado.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio9 {
  public static void main(String[] args) {
    
    int numero = 0;
    int contador = 0;
    
    do {
      
      System.out.println(numero);
      contador ++;
      numero = (int)(Math.random()*100);
      
      if (numero % 2 != 0) {
        numero = numero + 1;
      }
      
        
    } while (numero != 24);
    
    System.out.println();
    System.out.println("Se ha/n generado " + contador + " número/s");
    
  }
}
      
        
  
  
