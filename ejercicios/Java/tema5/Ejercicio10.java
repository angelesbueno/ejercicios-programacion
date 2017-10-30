/**
 * 5. Bucles.
 *
 * 10. Escribe un programa que calcule la media de un conjunto de números positivos 
*      introducidos por teclado. A priori, el programa no sabe cuántos números 
*      se introducirán. El usuario indicará que ha terminado de introducir 
*      los datos cuando meta un número negativo.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio10 {
  public static void main(String[] args) {
    
    int contador = 0;
    double suma = 0;
  
    System.out.println("Vamos a calcular la media de un conjunto de números positivos, te mostraré el resultado cuando introduzcas un número negativo");
    System.out.println("");
    System.out.print("Introduce un número positivo: ");
    double num = Double.parseDouble(System.console().readLine());
    
    
    if ((num < 0) && (contador == 0)) {
      System.out.print("Introduce al menos un número positivo");
    }
    
      
    while (num >= 0) {
      System.out.print("Introduce un número positivo: ");
      num = Integer.parseInt(System.console().readLine());
      contador++;
      suma += num;
    }
    
    if ((num < 0) && (contador > 1)) {
      System.out.print("La media de todos los números positivos es de: " + (suma - num) / (contador - 1));
    }
  }
}
      
      
        
    
    
      
      
