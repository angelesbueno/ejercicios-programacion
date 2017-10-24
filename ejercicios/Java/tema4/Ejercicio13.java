/**
 * 4. Sentencia condicional
 *
 * 13. Escribe un programa que ordene tres números enteros introducidos por teclado.
 *
 * @author Ángeles Bueno
 */
 
 
 public class Ejercicio13 {
  public static void main(String[] args) {
    
    System.out.println("Vamos a ordenar tres números");
    System.out.print("Escribe un número entero: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    System.out.print("Escribe otro número entero: ");
    int numero2 = Integer.parseInt(System.console().readLine());
    System.out.print("Escribe un último número, por favor: ");
    int numero3 = Integer.parseInt(System.console().readLine());
    
    if ((numero1 > numero2) && (numero2 > numero3)) {
      System.out.print("El orden descendente es: " + numero1 + ", " + numero2 +
      " y " + numero3 + ".");
    
    } else if ((numero1 > numero3) && (numero3 > numero2)) {
        System.out.print("El orden descendente es: " + numero1 + ", " + numero2 +
        " y " + numero3 + ".");
      
      } else if ((numero2 > numero1) && (numero1 > numero3)) {
          System.out.print("El orden descendente es: " + numero2 + ", " + numero1 +
          " y " + numero3 + ".");
        
        } else if ((numero2 > numero3) && (numero3 > numero1)) {
            System.out.print("El orden descendente es: " + numero2 + ", " + numero3 +
            " y " + numero1 + ".");
          
          } else if ((numero3 > numero1) && (numero1 > numero2)) {
              System.out.print("El orden descendente es: " + numero3 + ", " + numero1 +
              " y " + numero2 + ".");
              
            } else if ((numero3 > numero2) && (numero2 > numero1)) {
                System.out.print("El orden descendente es: " + numero3 + ", " + numero2 +
                " y " + numero1 + ".");
              } 
                
        
  }
}
            
          
          
      
    
  
    
    
