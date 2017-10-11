public class Ejercicio2 {
  public static void main(String args[]) {
      
      System.out.print("Introduce una cantidad en euros:");
      double euros = Integer.parseInt(System.console().readLine());
      System.out.print("La cantidad en pesetas es :" + (euros*166.386));
      
      
    }
  }
