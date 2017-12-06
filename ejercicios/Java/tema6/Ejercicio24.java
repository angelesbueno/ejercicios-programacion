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
    long numeroIntroducido = Integer.parseInt(System.console().readLine());
    long auxiliar = numeroIntroducido;
    long digito = 0;
    int contadorDigitos = 0;
    
    while (numeroIntroducido >= 1) {
        
      digito = (digito * 10) + (numeroIntroducido % 10);
      contadorDigitos ++;
      numeroIntroducido /= 10;
    }
    
    System.out.println(contadorDigitos);
    
    long [] numero = new long[contadorDigitos];
    int j = 0;
    
    while (auxiliar >= 1) {
        
      numero[j] = auxiliar % 10;
      auxiliar /= 10;
      j ++;
    }
    
    long numAzar = ((long)(Math.random() * contadorDigitos));
    
    System.out.println(numAzar);
    
    //mal, preguntar.
    
    
    /**for (int i = 0; i < contadorDigitos; i ++) {
        
      System.out.print(numero[i] + " ");*/
    
  }
}
    

      
      
    
    
