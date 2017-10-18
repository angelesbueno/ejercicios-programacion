/**
 * 4. Sentencia condicional
 *
 * 2. Realiza un programa que pida una hora por teclado y que muestre luego 
      buenos días, buenas tardes o buenas noches según la hora. Se utilizarán 
      los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen
      en cuenta las horas, los minutos no se deben introducir por teclado.
 *
 * @author Ángeles Bueno
 */
 
 public class Ejercicio2 {
  public static void main(String[] args) {
    
    System.out.print("Introduce una hora del día sin minutos: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    String buenas;
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("¡Buenos días!");
    }
    
    if ((hora >= 13) && (hora <= 20)) {
      System.out.println("¡Buenas tardes!");
    }
    
    if ((hora >=21) && (hora <= 24)) {
      System.out.println("¡Buenas noches!");
    }
    
    if ((hora >=0) && (hora <= 5)) {
      System.out.println("¡Buenas noches!");
    }
    
    if (hora >=25) {
      System.out.println("¡Esa hora no existe!");
    }
    
  
  }
}
      
