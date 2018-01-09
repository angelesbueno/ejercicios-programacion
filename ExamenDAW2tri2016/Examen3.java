 /** Examen DAM 2.
 *
 * Ejercicio 3.
 *
 * @author Ángeles Bueno
 */
 
public class Examen3 {
  public static void main(String[] args) {
    
    int numAleatorio = ((int)(Math.random() * 100001));
    System.out.println("Número generado: " + numAleatorio);
    int auxiliar = numAleatorio;
    int digito = 0;
    int contadorDigitos = 0;
    int volteado= 0;
    
    while (numAleatorio >= 1) {
        
      digito = (digito * 10) + (numAleatorio % 10);
      contadorDigitos ++;
      numAleatorio /= 10;
    }
    int [] numero = new int[contadorDigitos];
    int j = 0;
    
    for (int i = contadorDigitos - 1; i >= 0; i--) {
      numero[i] = auxiliar % 10;
      auxiliar /= 10;
    }

    /**for (int i = 0; i < contadorDigitos; i++) {
      System.out.print(numero[i] + " ");
    }*/
    System.out.println();
    System.out.println();
    
    // empezar a pintar
    int altura = 0;
    int altura2 = 0;
    int k = 0;
    int espacios = 20;
    
    while (altura <= contadorDigitos) {
      if (numero[k] == 0) {
        k ++;
        altura ++;
      
      } else {
      
        while (altura2 < numero[k]) {
          
          for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
          }
          System.out.print("*");
          System.out.println();
          altura2 ++;
          espacios ++;
        }
        altura ++;
        k ++;
        altura2 = 0;
        espacios -=2;
        while (altura2 < numero[k]) {
          
          for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
          }
          System.out.print("*");
          System.out.println();
          altura2 ++;
          espacios --;
        }
        altura ++;
        k ++;
        altura2 = 0;
        espacios +=2;
      }
    }
  }
}
