/**
 * 4. Sentencia condicional
 *
 * 6. Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
      una altura h. Aplica la fórmula t = raiz(2h/g) siendo g = 9.81 m/s2
 *
 * @author Ángeles Bueno
 */
 
 public class Ejercicio6 {
  public static void main(String[] args) {
    
    System.out.println("Vamos a calcular cuánto tiempo tardará en caer un objeto desde una altura determinada.");
    System.out.print("Introduce una altura en metros: ");
    double h = Double.parseDouble(System.console().readLine());
      
    double g = 9.81; 
    double tiempo = Math.sqrt(2*h/g);
    
    System.out.print("El objeto tardará " + tiempo + " segundos en caer.");
    
  }
}
      
      
