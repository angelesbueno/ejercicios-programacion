 /** 
  * Ejercicio 2.
  * 
  * 09/01/2018
  * Recuperación DAW Primer Trimestre
  * 
  * @author Ángeles Bueno Aguilar
 */
 
public class Ex04aba2 {
  public static void main(String[] args) {
    
    int numeroIntroducido = 0;
    int auxiliar = 0;
    int digito = 0;
    int maximo = 0;
    int contadorMaximo = 0;
    
    System.out.print("Introduzca un número: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    auxiliar = numeroIntroducido;
    
    while (numeroIntroducido != 0) {
      digito = numeroIntroducido % 10;
      
      if (digito > maximo) { 
        maximo = digito;
      }
      numeroIntroducido /= 10;
      /**System.out.println(digito);
      System.out.println(maximo);
      System.out.println(contadorMaximo);*/
    }
    
    while (auxiliar != 0) {
      digito = auxiliar % 10;

      if (maximo == digito) {
        contadorMaximo ++;
      }
      auxiliar /= 10;
    }
    
    if (contadorMaximo == 1) {
      System.out.print("El dígito más alto es el " + maximo + " y aparece " + contadorMaximo + " vez."); 
    }
    if (contadorMaximo > 1) {
      System.out.print("El dígito más alto es el " + maximo + " y aparece " + contadorMaximo + " veces."); 
    }
  }
}   
    
  
