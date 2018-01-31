/**
 * Bucles
 *
 * Examen Primos.
 *
 * @author Ángeles Bueno
 */
 
public class ExamenPrimos {
  public static void main(String[] args) {
    
    int suma = 0;
    int contadorPrimo = 0;
    System.out.println("Por favor, introduzca diez número enteros positivos:");
    
    for (int i = 0; i < 10; i++) {
      int numero = Integer.parseInt(System.console().readLine());
      
      boolean esPrimo = true;
    
      for (int j = 2; j < numero; j++) {
        if ((numero % j) == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        suma += numero;
        contadorPrimo ++;
      }
      
    }
    
    if (contadorPrimo == 0) {
      System.out.println("No ha introducido ningún número primo, no puedo calcular la media.");
    } else {
      System.out.println("La media de los primos es: " + suma / contadorPrimo);
    }
  }
}
