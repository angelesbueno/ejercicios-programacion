/**
 * Examen
 *
 * 1. 
 *
 * @author Ángeles Bueno
 */
 
public class ExamenP1 {
  public static void main(String[] args) {
    
    boolean esPrimo = true;
    int contadorNoPrimos = 0;
    int numMax = 1;
    int numMin = 999999999;
    int suma = 0;

      while (esPrimo) {
        
        System.out.print("Introduzca un número: ");
        int numero = Integer.parseInt(System.console().readLine());
        
        for (int i = 2; (numero % i == 0); i++) {
          esPrimo = false;
        }
        
        if (esPrimo) {
          esPrimo = false;
        
        } else {
            esPrimo = true;
            contadorNoPrimos++;
            suma = suma + numero;
            
            if (numero < numMin) {
              numMin = numero;
            }
            
            if (numero > numMax) {
              numMax = numero;
            }
          }
      }
      System.out.println("Ha introducido " +contadorNoPrimos+ " números no primos.");
      System.out.println("La media de todos los números no primos introducidos es " + suma / contadorNoPrimos +("."));
      System.out.println("El número mínimo es "+numMin);
      System.out.println("El número máximo es "+numMax);
    }
  }

      
      
      
            
            
