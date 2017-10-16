/**
 * 2. Variables.
 *
 * 5. Realiza un conversor de pesetas a euros. La cantidad en pesetas que se 
 *    quiere convertir deberá estar almacenada en una variable.
 *
 * @author Ángeles Bueno
 */


public class Ejercicio5 {
  public static void main(String args[]) {
      
      int pesetas= 2500;
      double euros;
      euros= (double) (pesetas / 166.386);
      
      System.out.println(pesetas+" pesetas son " +euros+ "euros.");
      
    }
  }
