/**
 * 5. Bucles.
 *
 * 10. Escribe un programa que calcule la media de un conjunto de números 
 *     positivos introducidos por teclado. A priori, el programa no sabe 
 *     cuántos números se introducirán. El usuario indicará que ha terminado 
 *     de introducir los datos cuando meta un número negativo.
 *
 * @author Ángeles Bueno
 */
 
public class bucles10 {
  public static void main(String[] args) {
    
    System.out.println("Vamos a calcular la media de todos los números positivos que introduzcas. Cuando quieras saber el resultado, introduce un número negativo. Pulsa INTRO para comenzar.");
    
    int contador = 0;
    int suma = 0;
    int numeroIntroducido;
    
    do {
      
      System.out.print("Introduce un número :"); 
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido >= 0) {
        suma = suma + numeroIntroducido;
        contador++;
      }
    
    } while (numeroIntroducido >= 0);
    
    System.out.print("La media de todos los números positivos introducidos es: " + (suma / contador));
  }
}

      
        
        
        
  
