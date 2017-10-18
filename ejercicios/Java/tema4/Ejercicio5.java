/**
 * 4. Sentencia condicional
 *
 * 5. Realiza un programa que resuelva una ecuación de primer grado 
      (del tipo ax + b = 0).
 *
 * @author Ángeles Bueno
 */
 
 
public class Ejercicio5 {
  public static void main(String[] args) {
  
    System.out.println("Vamos a resolver una ecuación de primer grado del tipo ax + b = 0");
    System.out.print("Introduce un valor para a: ");
      double a = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce un valor para b: ");
      double b = Double.parseDouble(System.console().readLine());
      
    if (a == 0) {
      System.out.println("El problema no se puede resolver");
    } else {
      System.out.println("El resultado será x= " + (-b/a));
    }
  }
}
  
      
      
  
    
  
