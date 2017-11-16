 /** Examen DAW 2.
 *
 * Ejercicio 2
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio2 {
  public static void main(String[] args) {
  
  long numeroIntroducido = 0;
  long aux = numeroIntroducido;
  long nuevoNumero = 0; 
  long contadorCapicua = 0;
  long media = 0;
  long suma = 0;
  long volteado = 0;
  
  System.out.println("Por favor, introduzca 10 números enteros positivos: ");
    
    for(int i = 1; i <= 10; i++) {
      
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      aux = numeroIntroducido;
      volteado = 0;
 
      while (numeroIntroducido > 0) {
        volteado = (volteado * 10) + (numeroIntroducido % 10);
        numeroIntroducido /= 10;
  
      }

      if (aux == volteado) {
      
        suma = suma + volteado;
        contadorCapicua ++;

      } 
    }

    if (contadorCapicua == 0) {
      System.out.println("No ha introducido ningún número capicúa, no puedo calcular la media.");
    
    } else {
        media = suma / contadorCapicua;
        System.out.println("La media de los capicúa es " + media);
      }
  }
}

  
  
    
          
          
